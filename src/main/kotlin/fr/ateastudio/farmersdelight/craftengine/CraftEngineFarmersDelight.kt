package fr.ateastudio.farmersdelight.craftengine

/**
 * Entry point for the CraftEngine edition of Farmer's Delight.
 * Registers an example modelled furniture block.
 */
object CraftEngineFarmersDelight : CraftEngineAddon() {

    override fun onEnable() {
        // Example registration; replace with actual blocks.
        FurnitureBlockStorage.register(
            ModelledFurnitureBlock(
                id = "farmersdelight:stove",
                model = "craftengine:furniture/stove"
            )
        )
    }
}
