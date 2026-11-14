package net.jalnyr.jalnyrsmobs.item;

import net.jalnyr.jalnyrsmobs.Jalnyrsmobs;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Jalnyrsmobs.MOD_ID);
    public static final RegistryObject<CreativeModeTab> JALNYRSMOBS = CREATIVE_MODE_TABS.register("jalnyrsmobs",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DRUGD_TAIL.get()))
                    .title(Component.translatable("creativetab.jalnyrsmobs"))
                    .displayItems((pParametres, pOutput) -> {
                        pOutput.accept(ModItems.DRUGD_TAIL.get());
                        pOutput.accept(ModItems.GUARD_FISTS.get());
                        pOutput.accept(ModItems.DRUGD_SPAWN_EGG.get());
                        pOutput.accept(ModItems.CORRUPTED_GUARD_SPAWN_EGG.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
