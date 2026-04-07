package org.test.stuff.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.test.stuff.Stuff;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Stuff.MODID);

    public static final RegistryObject<CreativeModeTab> STUFF_TAB = CREATIVE_MODE_TABS.register("stuff_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STUFF_ICON.get()))
                    .title(Component.translatable("creativetab.stuff_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.HOT.get());
                        pOutput.accept(ModItems.CHOC.get());
                        pOutput.accept(ModItems.CD.get());
                        pOutput.accept(ModItems.SABER.get());
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.COLA.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
