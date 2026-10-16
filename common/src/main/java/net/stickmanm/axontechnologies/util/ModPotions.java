package net.stickmanm.axontechnologies.util;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.stickmanm.axontechnologies.effect.ModEffects;

public class ModPotions {

    public static final Potion GLITCHSTERX;

    private static Potion register(String name, Potion potion) {
        return (Potion) Registry.register(Registries.POTION, name, potion);
    }

    private static Potion register(RegistryKey<Potion> key, Potion potion) {
        return (Potion)Registry.register(Registries.POTION, key, potion);
    }

    static {
        GLITCHSTERX = register("glitchsterx", new Potion(new StatusEffectInstance[]{new StatusEffectInstance(ModEffects.GLITCHSTERX, 3600)}));
    }

}
