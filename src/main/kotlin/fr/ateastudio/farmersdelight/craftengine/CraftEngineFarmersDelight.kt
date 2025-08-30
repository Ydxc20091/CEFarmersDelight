package fr.ateastudio.farmersdelight.craftengine

import net.momirealms.craftengine.core.util.Key

/**
 * Entry point for the CraftEngine edition of Farmer's Delight.
 * Registers an example furniture block and listener.
 */
class CraftEngineFarmersDelight : CraftEngineAddon() {
    override fun onEnable() {
        server.pluginManager.registerEvents(CraftEngineFurnitureListener, this)

        FurnitureBlockStorage.register(
            FurnitureBlock(
                id = Key.of("farmersdelight", "stove"),
                onInteract = { player ->
                    player.sendMessage("The stove crackles softly.")
                }
            )
        )
    }
}
