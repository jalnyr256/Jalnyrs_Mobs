package net.jalnyr.jalnyrsmobs.item;

import net.jalnyr.jalnyrsmobs.Jalnyrsmobs;
import net.jalnyr.jalnyrsmobs.entity.ModEntities;
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
    public static final RegistryObject<Item> DRUGD_TAIL = ITEMS.register("drugd_tail",
            ()-> new Item(new Item.Properties().food(ModFoods.DRUGD_TAIL)));
    public static final RegistryObject<Item> CORRUPTED_GUARD_SPAWN_EGG = ITEMS.register("corrupted_guard_spawn_egg",
            ()-> new ForgeSpawnEggItem(ModEntities.CORRUPTED_GUARD, 0x1e3630, 0xc6d1c5, new Item.Properties()));
    public static final RegistryObject<Item> DRUGD_SPAWN_EGG = ITEMS.register("drugd_spawn_egg",
            ()-> new ForgeSpawnEggItem(ModEntities.DRUGD, 0x1e3630, 0xc6d1c5, new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
