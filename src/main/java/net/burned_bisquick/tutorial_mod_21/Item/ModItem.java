package net.burned_bisquick.tutorial_mod_21.Item;

import net.burned_bisquick.tutorial_mod_21.TutorialMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CrossbowItem;
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

    public static final RegistryObject<Item> Ultimatum_Nugget = ITEMS.register("ultimatum_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ultimatum_Ingot = ITEMS.register("ultimatum_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFURNIUM_ORE = ITEMS.register("infurnium_ore",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MALICIOUS_ORE = ITEMS.register("malicious_ore",
            () -> new Item(new Item.Properties()));

//    public static final RegistryObject<Item> Void_Berries = ITEMS.register("void_berries",
//            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Parsnip = ITEMS.register("parsnip",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationModifier(0.3f)
                            .build())


                    ));

//    public static final RegistryObject<Item> Scoped_Crossbow = ITEMS.register("scoped_crossbow",
//            () -> new CrossbowItem(new Item.Properties().durability(640)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }


}
