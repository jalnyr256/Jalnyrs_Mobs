package net.jalnyr.jalnyrsmobs.event;


import net.jalnyr.jalnyrsmobs.Jalnyrsmobs;
import net.jalnyr.jalnyrsmobs.entity.client.CorruptedGuardModel;
import net.jalnyr.jalnyrsmobs.entity.client.DrugdModel;
import net.jalnyr.jalnyrsmobs.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Jalnyrsmobs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.CORRUPTED_GUARD_LAYER, CorruptedGuardModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.DRUGD_LAYER, DrugdModel::createBodyLayer);
    }


}
