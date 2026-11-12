package net.jalnyr.jalnyrsmobs.event;

import net.jalnyr.jalnyrsmobs.Jalnyrsmobs;
import net.jalnyr.jalnyrsmobs.entity.ModEntities;
import net.jalnyr.jalnyrsmobs.entity.custom.CorruptedGuardEntity;
import net.jalnyr.jalnyrsmobs.entity.custom.DrugdEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Jalnyrsmobs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.CORRUPTED_GUARD.get(), CorruptedGuardEntity.CreateAttributes().build());
        event.put(ModEntities.DRUGD.get(), DrugdEntity.CreateAttributes().build());
    }
}
