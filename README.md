# Custom Mob Attributes

A Fabric mod that lets you change the **health**, **attack damage**, **movement speed** and **scale** of vanilla and modded mobs, one mob at a time or all at once.

## Requirements

| | Version |
| --- | --- |
| Minecraft | 26.2 |
| Fabric Loader | 0.16.14 or newer |
| Fabric API | any |
| [owo-lib](https://modrinth.com/mod/owo-lib) | 0.13.1+26.2 |
| Java | 25 |

[Mod Menu](https://modrinth.com/mod/modmenu) is optional and adds a button to open the config screen in game.

## Configuration

Settings are edited from the in-game config screen (via Mod Menu) or in `config/custom-mob-attributes.json5`. On a server, the server config overrides the client's.

Every value is a multiplier applied to the mob's base attribute: `1.0` leaves it unchanged, `2.0` doubles it, `0.5` halves it.

- **All Mobs / All Baby Mobs**: global multipliers, stacked on top of the per-mob ones for every supported mob.
- **Per mob**: one section per mob with its own multipliers. Mobs that can be babies also have a separate baby block.
- **`adultsAlsoAffectBabies`**: when enabled (default), babies also use their adult version's multipliers.

### Random value ranges

Each per-mob multiplier has an optional **Range** block. When it is enabled, every mob picks its own random multiplier between `min` and `max` when it spawns and keeps it for life. A group of zombies can then have slightly different health, speed or size.

| Option | Default | Description |
| --- | --- | --- |
| `enabled` | `false` | Use the range instead of the fixed value |
| `min` | `0.8` | Lowest possible multiplier (must be greater than 0) |
| `max` | `1.25` | Highest possible multiplier (must be greater than `min`) |
| `curve` | `0` | `0` = every value equally likely, `> 0` = values near the middle are more common, `< 0` = values near `min` and `max` are more common (from -5 to 5) |

- If a range is invalid, the mob uses the fixed value and a warning is logged.
- Babies draw from the adult range and keep that value when they grow up.
- If you change a range later, existing mobs keep their relative position in the new range.

Advanced users can tune the distribution itself in the **Range Formulas** section.

## Mod compatibility

Mobs from these mods have their own config sections, which apply when the mod is installed:

- Better End
- Better Nether
- Deeper and Darker
- Friends & Foes
- Illager Invasion
- It Takes a Pillage
- Mob Variants
- Ribbits
- Variants & Ventures
- Zombie Variants

Mobs from other mods are not supported yet and keep their default attributes.

## Building

```sh
./gradlew build
```

The jar is written to `build/libs/`. You need JDK 25. If Gradle doesn't pick it up, set `org.gradle.java.home` in your user-level `~/.gradle/gradle.properties`.

To start a test client:

```sh
./gradlew runClient
```

## Links

- [Issues](https://github.com/Fneifnox/custom-mob-attributes/issues)
- [Discord](https://discord.gg/bszSDCq5ms)

## License

Released under [Fneifnox's License](LICENSE).
