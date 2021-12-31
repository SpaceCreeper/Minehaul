package com.defnotjy_.minehaul.block;

import com.defnotjy_.minehaul.Minehaul;
import com.defnotjy_.minehaul.block.custom.RicePlantBlock;
import com.defnotjy_.minehaul.item.ModItems;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Minehaul.MOD_ID);

    //Underground Blocks
    public static final RegistryObject<Block> SLATE = registerBlock("slate",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ZINC_ORE = registerBlock("zinc_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()));

    //Tungsten
    public static final RegistryObject<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    //Experience
    public static final RegistryObject<Block> EXPERIENCE_ORE = registerBlock("experience_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()));

    //Alpha
    public static final RegistryObject<Block> ALPHA_ORE = registerBlock("alpha_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ALPHA_BLOCK = registerBlock("alpha_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    //Ionic
    public static final RegistryObject<Block> IONIC_BLOCK = registerBlock("ionic_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> IONIC_CRYSTAL = registerBlock("ionic_crystal",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5f).requiresCorrectToolForDrops()));

    //Redwood
    public static final RegistryObject<Block> REDWOOD_LOG = registerBlock("redwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3f).sound(SoundType.WOOD).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3f).sound(SoundType.WOOD).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> REDWOOD_WOOD = registerBlock("redwood_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3f).sound(SoundType.WOOD).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3f).sound(SoundType.WOOD).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> REDWOOD_PLANKS = registerBlock("redwood_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(3f).sound(SoundType.WOOD).requiresCorrectToolForDrops()));

    //Mangrove
    public static final RegistryObject<Block> MANGROVE_LOG = registerBlock("mangrove_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3f).sound(SoundType.WOOD).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG = registerBlock("stripped_mangrove_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3f).sound(SoundType.WOOD).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANGROVE_WOOD = registerBlock("mangrove_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3f).sound(SoundType.WOOD).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STRIPPED_MANGROVE_WOOD = registerBlock("stripped_mangrove_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3f).sound(SoundType.WOOD).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANGROVE_PLANKS = registerBlock("mangrove_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(3f).sound(SoundType.WOOD).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANGROVE_LEAVES = registerBlock("mangrove_leaves",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(3f).sound(SoundType.AZALEA_LEAVES).requiresCorrectToolForDrops()));

    //Mud
    public static final RegistryObject<Block> MUD_BLOCK = registerBlock("mud_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3f).sound(SoundType.WET_GRASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MUD_BRICKS = registerBlock("mud_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(3f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> TINTED_GLASS_PANE = registerBlock("tinted_glass_pane",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3f)));

    public static final RegistryObject<Block> RICE_PLANT = BLOCKS.register("rice_plant",
            () -> new RicePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).sound(SoundType.CROP).requiresCorrectToolForDrops()));

    //Flowers
    public static final RegistryObject<Block> LAVENDER = registerBlock("lavender",
            () -> new FlowerBlock(MobEffects.LUCK, 30,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PINK_ORCHID = registerBlock("pink_orchid",
            () -> new FlowerBlock(MobEffects.HEAL, 2,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ORANGE_ORCHID = registerBlock("orange_orchid",
            () -> new FlowerBlock(MobEffects.DIG_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).requiresCorrectToolForDrops()));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
