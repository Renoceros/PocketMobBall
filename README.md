# PokéCapture – Mob Capture and Release Mod

PokéCapture is a Fabric mod that allows players to capture and release any mob in Minecraft using a throwable item similar to a Pokéball. It preserves all NBT data of the captured entity, allowing for exact restoration upon release.

---

## Features

- **Throwable Capture Item:** Functions like a snowball but instead captures mobs instead of dealing damage.  
- **Full NBT Retention:** Captured mobs retain all data, including name, health, equipment, and custom tags.  
- **Releasing Mobs:** Throw the filled PokéCapture ball again to release the stored mob at the impact location.  
- **Durability System:** Each ball has limited uses before it breaks.  
- **Optional Energy Support (Planned):** Future updates may add Fabric Energy API integration for electric-powered capture devices.  
- **Lightweight and Non-Invasive:** Does not modify vanilla mob spawning, AI, or world generation.

---

## How It Works

1. **Craft or obtain** a PokéCapture ball.  
2. **Throw** it at a mob. If successful, the mob will be captured and stored inside the ball’s NBT data.  
3. **Throw** the same ball again to release the mob with all its original attributes restored.

---

## Technical Details

- Written for **Fabric Loader 0.17.3** and **Minecraft 1.21.1**(For now).  
- Custom projectile entity inherits from `SnowballEntity`.  
- Captured mob data is stored as a serialized NBT tag in the PokéCapture ball’s ItemStack.  
- Release behavior reconstructs the entity from NBT at the impact position.  
- Configurable durability and capture success chance (planned).

---

## Planned Features

- Integration with **Fabric Energy API** (powered Pokéball variants).  
- Capture cooldown or failure rate.  
- Custom crafting recipes and advancement integration.  
- Visual particle effects and capture animation.  
- Compatibility with modded mobs.

---

## License

MIT License.  
You are free to use, modify, and distribute this mod as long as proper credit is given.

---

## Credits

Developed by Me(Renoceros).  
Built with Fabric API and Minecraft Development tools.

