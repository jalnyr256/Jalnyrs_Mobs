package net.jalnyr.jalnyrsmobs.sound;

import net.jalnyr.jalnyrsmobs.Jalnyrsmobs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Jalnyrsmobs.MOD_ID);

    public static final RegistryObject<SoundEvent> HIT = registerSoundEvents("hit");

    public static final ForgeSoundType CORRUPTED_GUARD_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.HIT, ModSounds.HIT, ModSounds.HIT, ModSounds.HIT, ModSounds.HIT);

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, ()-> SoundEvent.createVariableRangeEvent(new ResourceLocation(Jalnyrsmobs.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
