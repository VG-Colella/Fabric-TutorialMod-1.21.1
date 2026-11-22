package net.vcol.tutorialmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.vcol.tutorialmod.block.ModBlocks;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //render transparent texture for mod blocks
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_TRAP_DOOR, RenderLayer.getCutout());
    }
}
