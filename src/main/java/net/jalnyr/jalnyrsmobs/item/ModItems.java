package net.jalnyr.jalnyrsmobs.item;

import net.jalnyr.jalnyrsmobs.Jalnyrsmobs;
import net.jalnyr.jalnyrsmobs.item.custom.FistItem;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Jalnyrsmobs.MOD_ID);
    public static final RegistryObject<Item> GUARD_FISTS = ITEMS.register("guard_fists",
            ()-> new FistItem(Tiers.NETHERITE, 5, -2.4F, new Item.Properties().setNoRepair()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
