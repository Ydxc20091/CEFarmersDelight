package fr.ateastudio.farmersdelight.craftengine

/**
 * Simple representation of a furniture block backed by CraftEngine's
 * storage system. The block keeps track of a model identifier and allows
 * invocation of custom interaction handlers.
 */
class ModelledFurnitureBlock(
    val id: String,
    val model: String,
    private val onInteract: (() -> Unit)? = null
) {

    fun interact() {
        onInteract?.invoke()
    }
}

/**
 * In-memory registry for modelled furniture blocks.
 */
object FurnitureBlockStorage {
    private val blocks = mutableMapOf<String, ModelledFurnitureBlock>()

    fun register(block: ModelledFurnitureBlock) {
        blocks[block.id] = block
    }

    fun get(id: String): ModelledFurnitureBlock? = blocks[id]
}
