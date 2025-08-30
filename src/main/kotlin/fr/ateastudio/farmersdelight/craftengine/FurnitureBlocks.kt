package fr.ateastudio.farmersdelight.craftengine

import net.momirealms.craftengine.core.util.Key
import org.bukkit.entity.Player

/**
 * Simple representation of a CraftEngine furniture block.
 * Each block holds an id and a custom interaction handler.
 */
data class FurnitureBlock(
    val id: Key,
    private val onInteract: (Player) -> Unit
) {
    fun interact(player: Player) = onInteract(player)
}

/**
 * In-memory registry for furniture blocks that wish to react to
 * CraftEngine's interaction events.
 */
object FurnitureBlockStorage {
    private val blocks = mutableMapOf<Key, FurnitureBlock>()

    fun register(block: FurnitureBlock) {
        blocks[block.id] = block
    }

    fun get(id: Key): FurnitureBlock? = blocks[id]
}
