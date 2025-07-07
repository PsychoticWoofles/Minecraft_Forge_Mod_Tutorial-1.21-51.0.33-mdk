package net.burned_bisquick.tutorial_mod_21.Item;

import net.burned_bisquick.tutorial_mod_21.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> Athernia = ITEMS.register("athernia",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Athernia_Ingot = ITEMS.register("athernia_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }


}
