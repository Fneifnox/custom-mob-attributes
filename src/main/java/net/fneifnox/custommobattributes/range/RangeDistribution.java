package net.fneifnox.custommobattributes.range;

// Maps a stored percentile (0..1) to a value inside [min, max].
//
// The center is the geometric mean sqrt(min * max). Each side of the center is stretched linearly,
// so a normalized distance d in [0, 1] means center + d * (max - center) above it and
// center - d * (center - min) below it.
//
// The distance follows a bounded gaussian whose standard deviation is "sigma" percent of the side width.
// When sigma is inside the blend interval, the density is (1 - f) * uniform + f * gaussian, f coming from
// the blend formula, so the curve flattens out to a uniform distribution.
// A negative curve mirrors the distance (d becomes 1 - d) to favor the extremes instead of the center.
public final class RangeDistribution {

    private static final double SQRT2 = Math.sqrt(2);
    private static final int BISECTION_STEPS = 60;

    private RangeDistribution() {}

    public static double valueAt(double percentile, double min, double max, double curve, double sigmaPercent, double blendWeight) {
        double center = Math.sqrt(min * max);
        double u = Math.clamp(percentile, 0, 1);
        double v = Math.abs(2 * u - 1);

        double s = Math.max(sigmaPercent / 100, 1e-6);
        double f = Math.clamp(blendWeight, 0, 1);

        double d = curve >= 0 ? distanceQuantile(v, s, f) : 1 - distanceQuantile(1 - v, s, f);

        return u >= 0.5 ? center + d * (max - center) : center - d * (center - min);
    }

    // Inverse of the cumulative distribution of the distance to the center
    private static double distanceQuantile(double p, double s, double f) {
        if (p <= 0) return 0;
        if (p >= 1) return 1;
        if (f <= 0) return p;

        double low = 0, high = 1;
        for (int i = 0; i < BISECTION_STEPS; i++) {
            double mid = (low + high) / 2;
            if (distanceCdf(mid, s, f) < p) low = mid;
            else high = mid;
        }
        return (low + high) / 2;
    }

    private static double distanceCdf(double d, double s, double f) {
        double gaussian = erf(d / (s * SQRT2)) / erf(1 / (s * SQRT2));
        return (1 - f) * d + f * gaussian;
    }

    // Abramowitz and Stegun 7.1.26, max error 1.5e-7
    private static double erf(double z) {
        double t = 1 / (1 + 0.3275911 * Math.abs(z));
        double y = 1 - t * (0.254829592 + t * (-0.284496736 + t * (1.421413741 + t * (-1.453152027 + t * 1.061405429)))) * Math.exp(-z * z);
        return z >= 0 ? y : -y;
    }
}
