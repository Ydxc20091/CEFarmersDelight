package fr.ateastudio.farmersdelight.craftengine

import net.momirealms.craftengine.bukkit.api.event.FurnitureInteractEvent
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener

/**
 * Routes CraftEngine furniture interaction events to
 * registered [FurnitureBlock] handlers.
 */
object CraftEngineFurnitureListener : Listener {
    @EventHandler
    fun onInteract(event: FurnitureInteractEvent) {
        FurnitureBlockStorage.get(event.furniture().id())
            ?.interact(event.player())
    }
}
