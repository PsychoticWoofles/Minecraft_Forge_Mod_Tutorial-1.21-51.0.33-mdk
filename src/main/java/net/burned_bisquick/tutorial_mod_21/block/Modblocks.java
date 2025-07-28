package net.burned_bisquick.tutorial_mod_21.block;

import net.burned_bisquick.tutorial_mod_21.Item.ModItem;
import net.burned_bisquick.tutorial_mod_21.TutorialMod;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class Modblocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);


    public static final RegistryObject<Block> UlTIMATUM_BLOCK = registerBlock("ultimatum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(8f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> RAW_UlTIMATUM = registerBlock("raw_ultimatum_block",
            () -> new DropExperienceBlock(UniformInt.of(8,16),BlockBehaviour.Properties.of()
                    .strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_ATHERNIA_BLOCK = registerBlock("raw_athernia_block",
            () -> new DropExperienceBlock(UniformInt.of(2,11),BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> RAW_INFURNIUM_ORE = registerBlock("raw_infurnium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,8),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));

    public static final RegistryObject<Block> SUSPICIOUS_STONE = registerBlock("suspicious_stone",
            () -> new DropExperienceBlock(UniformInt.of(4,8),BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockitem(name, toReturn);
        return toReturn;
    }



    private static <T extends Block> void registerBlockitem(String name, RegistryObject <T> block) {
        ModItem.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
