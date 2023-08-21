package net.theblackswitch.first_mod.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.theblackswitch.first_mod.FirstMod;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FirstMod.MODID);

    public static final RegistryObject<SoundEvent> AMETHYST_TILES_BREAK = registerSound("amethyst_tiles_break");

    public static final RegistryObject<SoundEvent> AMETHYST_TILES_STEP = registerSound("amethyst_tiles_step");

    public static final RegistryObject<SoundEvent> AMETHYST_TILES_PLACE = registerSound("amethyst_tiles_place");

    public static final RegistryObject<SoundEvent> AMETHYST_TILES_HIT = registerSound("amethyst_tiles_hit");

    public static final RegistryObject<SoundEvent> AMETHYST_TILES_FALL = registerSound("amethyst_tiles_fall");



    private static RegistryObject<SoundEvent> registerSound(String name) {
        ResourceLocation location = new ResourceLocation(FirstMod.MODID, name);
        return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(location));
    }

    public static void register(IEventBus bus) {
        SOUNDS.register(bus);
    }
}
