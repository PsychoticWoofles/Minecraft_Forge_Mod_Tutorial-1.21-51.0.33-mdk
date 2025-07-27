package net.burned_bisquick.tutorial_mod_21.Item;

import net.burned_bisquick.tutorial_mod_21.TutorialMod;
import net.burned_bisquick.tutorial_mod_21.block.Modblocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ULTIMATUM_ITEMS_TAB = CREATIVE_MODE_TABS.register("ultimatum_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.Ultimatum_Ingot.get()))
                    .title(Component.translatable("creativetab.tutorialmod.ultimatum_items"))
                    .displayItems((ItemDisplayParameters, output ) -> {
                        output.accept(ModItem.Ultimatum_Nugget.get());
                        output.accept(ModItem.Ultimatum_Ingot.get());
                        output.accept(Modblocks.UlTIMATUM_BLOCK.get());
                        output.accept(Modblocks.RAW_UlTIMATUM.get());


                    })

                    .build());


    public static final RegistryObject<CreativeModeTab> ATHERNIA_ITEMS_TAB = CREATIVE_MODE_TABS.register("athernia_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.Athernia.get()))
                    .withTabsBefore(ULTIMATUM_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.tutorialmod.athernia_items"))
                    .displayItems((ItemDisplayParameters, output ) -> {
                        output.accept(ModItem.Athernia.get());
                        output.accept(ModItem.Athernia_Ingot.get());
                        output.accept(Modblocks.RAW_ATHERNIA_BLOCK.get());

                    })

                    .build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
