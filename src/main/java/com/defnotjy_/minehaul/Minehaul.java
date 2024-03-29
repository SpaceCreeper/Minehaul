package com.defnotjy_.minehaul;

import com.defnotjy_.minehaul.block.ModBlocks;
import com.defnotjy_.minehaul.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fmlserverevents.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Minehaul.MOD_ID)
public class Minehaul {
    public static final String MOD_ID = "minehaul";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Minehaul() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::setupClient);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setupClient (final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RICE_PLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAVENDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_ORCHID.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_ORCHID.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.IONIC_CRYSTAL.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MANGROVE_LEAVES.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TINTED_GLASS_PANE.get(), RenderType.translucent());
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
