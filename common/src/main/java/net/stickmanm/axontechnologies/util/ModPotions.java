package net.stickmanm.axontechnologies.util;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.RegistryKeys;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.effect.ModEffects;

import java.util.function.Supplier;

public class ModPotions {

    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(AxonTechnologiesConstants.MOD_ID, RegistryKeys.POTION);

    public static final RegistrySupplier<Potion> GLITCHSTERX = POTIONS.register("glitchsterx",
            () -> new Potion(new StatusEffectInstance(ModEffects.GLITCHSTERX.get(), 3600)));

}
