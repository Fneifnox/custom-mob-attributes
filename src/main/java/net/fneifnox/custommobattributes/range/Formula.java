package net.fneifnox.custommobattributes.range;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Small math expression parser for the configurable range formulas.
// Variables: x (curve value), sigma (spread in %), pi, e
// Operators: + - * / ^ and parentheses
// Functions: abs, sqrt, exp, ln, log10, pow, min, max, floor, ceil
public final class Formula {

    // Kept out of the config class, owo would otherwise treat them as options
    public static final String DEFAULT_SIGMA = "100 * 0.5 ^ abs(x)";
    public static final String DEFAULT_BLEND = "2 - sigma / 50";

    @FunctionalInterface
    private interface Node {
        double eval(double x, double sigma);
    }

    private final Node root;

    private Formula(Node root) {
        this.root = root;
    }

    public double eval(double x, double sigma) {
        return root.eval(x, sigma);
    }

    public static Formula parse(String source) {
        Parser parser = new Parser(source);
        Node node = parser.parseExpression();
        parser.skipSpaces();
        if (parser.pos != source.length()) {
            throw parser.error("Unexpected character '" + source.charAt(parser.pos) + "'");
        }
        return new Formula(node);
    }

    @Nullable
    public static Formula tryParse(String source) {
        if (source == null) return null;
        try {
            return parse(source);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    private static final class Parser {
        private final String src;
        private int pos;

        private Parser(String src) {
            this.src = src;
        }

        private IllegalArgumentException error(String message) {
            return new IllegalArgumentException(message + " at position " + pos + " in formula \"" + src + "\"");
        }

        private void skipSpaces() {
            while (pos < src.length() && Character.isWhitespace(src.charAt(pos))) pos++;
        }

        private boolean eat(char c) {
            skipSpaces();
            if (pos < src.length() && src.charAt(pos) == c) {
                pos++;
                return true;
            }
            return false;
        }

        private Node parseExpression() {
            Node left = parseTerm();
            while (true) {
                if (eat('+')) {
                    Node l = left, r = parseTerm();
                    left = (x, s) -> l.eval(x, s) + r.eval(x, s);
                }
                else if (eat('-')) {
                    Node l = left, r = parseTerm();
                    left = (x, s) -> l.eval(x, s) - r.eval(x, s);
                }
                else return left;
            }
        }

        private Node parseTerm() {
            Node left = parseUnary();
            while (true) {
                if (eat('*')) {
                    Node l = left, r = parseUnary();
                    left = (x, s) -> l.eval(x, s) * r.eval(x, s);
                }
                else if (eat('/')) {
                    Node l = left, r = parseUnary();
                    left = (x, s) -> l.eval(x, s) / r.eval(x, s);
                }
                else return left;
            }
        }

        private Node parseUnary() {
            if (eat('-')) {
                Node operand = parseUnary();
                return (x, s) -> -operand.eval(x, s);
            }
            if (eat('+')) {
                return parseUnary();
            }
            return parsePower();
        }

        private Node parsePower() {
            Node base = parsePrimary();
            if (eat('^')) {
                // Right associative: 2^3^2 = 2^(3^2)
                Node exponent = parseUnary();
                return (x, s) -> Math.pow(base.eval(x, s), exponent.eval(x, s));
            }
            return base;
        }

        private Node parsePrimary() {
            skipSpaces();
            if (pos >= src.length()) throw error("Unexpected end of formula");

            if (eat('(')) {
                Node inner = parseExpression();
                if (!eat(')')) throw error("Missing ')'");
                return inner;
            }

            char c = src.charAt(pos);
            if (Character.isDigit(c) || c == '.') {
                int start = pos;
                while (pos < src.length() && (Character.isDigit(src.charAt(pos)) || src.charAt(pos) == '.')) pos++;
                if (pos < src.length() && (src.charAt(pos) == 'e' || src.charAt(pos) == 'E')) {
                    int save = pos;
                    pos++;
                    if (pos < src.length() && (src.charAt(pos) == '+' || src.charAt(pos) == '-')) pos++;
                    if (pos < src.length() && Character.isDigit(src.charAt(pos))) {
                        while (pos < src.length() && Character.isDigit(src.charAt(pos))) pos++;
                    }
                    else pos = save;
                }
                try {
                    double value = Double.parseDouble(src.substring(start, pos));
                    return (x, s) -> value;
                } catch (NumberFormatException e) {
                    throw error("Invalid number");
                }
            }

            if (Character.isLetter(c)) {
                int start = pos;
                while (pos < src.length() && (Character.isLetterOrDigit(src.charAt(pos)) || src.charAt(pos) == '_')) pos++;
                String name = src.substring(start, pos).toLowerCase(Locale.ROOT);

                if (eat('(')) {
                    List<Node> args = new ArrayList<>();
                    if (!eat(')')) {
                        do {
                            args.add(parseExpression());
                        } while (eat(','));
                        if (!eat(')')) throw error("Missing ')' after arguments of " + name);
                    }
                    return function(name, args);
                }

                return switch (name) {
                    case "x" -> (x, s) -> x;
                    case "sigma" -> (x, s) -> s;
                    case "pi" -> (x, s) -> Math.PI;
                    case "e" -> (x, s) -> Math.E;
                    default -> throw error("Unknown variable '" + name + "'");
                };
            }

            throw error("Unexpected character '" + c + "'");
        }

        private Node function(String name, List<Node> args) {
            int expected = switch (name) {
                case "abs", "sqrt", "exp", "ln", "log10", "floor", "ceil" -> 1;
                case "pow", "min", "max" -> 2;
                default -> throw error("Unknown function '" + name + "'");
            };
            if (args.size() != expected) {
                throw error("Function " + name + " expects " + expected + " argument(s), got " + args.size());
            }
            Node a = args.get(0);
            Node b = expected == 2 ? args.get(1) : null;
            return switch (name) {
                case "abs" -> (x, s) -> Math.abs(a.eval(x, s));
                case "sqrt" -> (x, s) -> Math.sqrt(a.eval(x, s));
                case "exp" -> (x, s) -> Math.exp(a.eval(x, s));
                case "ln" -> (x, s) -> Math.log(a.eval(x, s));
                case "log10" -> (x, s) -> Math.log10(a.eval(x, s));
                case "floor" -> (x, s) -> Math.floor(a.eval(x, s));
                case "ceil" -> (x, s) -> Math.ceil(a.eval(x, s));
                case "pow" -> (x, s) -> Math.pow(a.eval(x, s), b.eval(x, s));
                case "min" -> (x, s) -> Math.min(a.eval(x, s), b.eval(x, s));
                default -> (x, s) -> Math.max(a.eval(x, s), b.eval(x, s));
            };
        }
    }
}
