package org.test.stuff.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.test.stuff.item.ModFoods.*;
import org.test.stuff.Stuff;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, Stuff.MODID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CD = ITEMS.register("cd",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HOT = ITEMS.register("hot",
            () -> new Item(new Item.Properties().food(ModFoods.HOT)));

    public static final RegistryObject<Item> STUFF_ICON = ITEMS.register("stuff_icon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHOC = ITEMS.register("choc",
            () -> new Item(new Item.Properties().food(ModFoods.CHOC)));

    public static final RegistryObject<Item> SABER = ITEMS.register("lightsaber",
            () -> new Item(new Item.Properties().stacksTo(1).fireResistant()));

    public static final RegistryObject<Item> COLA = ITEMS.register("cola",
            () -> new Item(new Item.Properties().food(ModFoods.COLA)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}