package net.jalnyr.jalnyrsmobs.entity;

import net.jalnyr.jalnyrsmobs.Jalnyrsmobs;
import net.jalnyr.jalnyrsmobs.entity.custom.CorruptedGuardEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Jalnyrsmobs.MOD_ID);

    public static final RegistryObject<EntityType<CorruptedGuardEntity>> CORRUPTED_GUARD =
            ENTITY_TYPES.register("corrupted_guard", ()-> EntityType.Builder.of(CorruptedGuardEntity::new, MobCategory.MONSTER)
                    .sized(3f, 6f).build("corrupted_guard"));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
