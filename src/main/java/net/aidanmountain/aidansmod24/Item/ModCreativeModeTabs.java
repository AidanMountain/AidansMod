package net.aidanmountain.aidansmod24.Item;

import net.aidanmountain.aidansmod24.ExampleMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
     public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MODID);

             public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HOCKEY.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.HOCKEY_HELMET.get());
                        pOutput.accept(ModItems.HOCKEY_CHESTPLATE.get());
                        pOutput.accept(ModItems.HOCKEY_LEGGINGS.get());
                        pOutput.accept(ModItems.HOCKEY_BOOTS.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
