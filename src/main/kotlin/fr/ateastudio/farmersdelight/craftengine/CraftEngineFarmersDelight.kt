package fr.ateastudio.farmersdelight.craftengine

import net.momirealms.craftengine.bukkit.api.CraftEngineFurniture
import net.momirealms.craftengine.core.entity.furniture.AnchorType
import net.momirealms.craftengine.core.util.Key
import org.bukkit.Bukkit

/**
 * Entry point for the CraftEngine edition of Farmer's Delight.
 * Demonstrates interaction with the CraftEngine furniture API.
 */
object CraftEngineFarmersDelight : CraftEngineAddon() {

    override fun onEnable() {
        // Attempt to place the stove furniture at the spawn of the first world.
        val world = Bukkit.getWorlds().firstOrNull() ?: return
        CraftEngineFurniture.place(
            world.spawnLocation,
            Key.of("farmersdelight", "stove"),
            AnchorType.GROUND
        )
    }
}
