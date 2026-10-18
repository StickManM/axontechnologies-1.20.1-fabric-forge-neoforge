package net.stickmanm.axontechnologies.effect;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.RegistryKeys;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.effect.custom.*;

import java.util.function.Supplier;

public class ModEffects {

    public static final DeferredRegister<StatusEffect> EFFECTS =
            DeferredRegister.create(AxonTechnologiesConstants.MOD_ID, RegistryKeys.STATUS_EFFECT);

    public static final RegistrySupplier<StatusEffect> GLITCHSTER = EFFECTS.register("glitchster", GlitchsterEffect::new);
    public static final RegistrySupplier<StatusEffect> GLITCHSTERII = EFFECTS.register("glitchster2", GlitchsterIIEffect::new);
    public static final RegistrySupplier<StatusEffect> GLITCHSTERIII = EFFECTS.register("glitchster3", GlitchsterIIIEffect::new);
    public static final RegistrySupplier<StatusEffect> GLITCHSTERIV = EFFECTS.register("glitchster4", GlitchsterIVEffect::new);
    public static final RegistrySupplier<StatusEffect> GLITCHSTERV = EFFECTS.register("glitchster5", GlitchsterVEffect::new);
    public static final RegistrySupplier<StatusEffect> GLITCHSTERX = EFFECTS.register("glitchx", GlitchsterXEffect::new);
    public static final RegistrySupplier<StatusEffect> OVERDOSE = EFFECTS.register("overdose", OverdoseEffect::new);
    public static final RegistrySupplier<StatusEffect> NEUTRALIZED_GLITCHSTER = EFFECTS.register("neutralized_glitchster", NeutralizedGlitchsterEffect::new);
    public static final RegistrySupplier<StatusEffect> THUNDER_POISONING = EFFECTS.register("thunder_poisoning", ThunderPoisoningEffect::new);

    public static final RegistrySupplier<StatusEffect> ANTIGLITCHSTER = EFFECTS.register("antiglitchster", AntiGlitchsterEffect::new);
    public static final RegistrySupplier<StatusEffect> CORRUPTED_GLITCHSTER = EFFECTS.register("corrupted_glitchster", CorruptedGlitchsterEffect::new);
    public static final RegistrySupplier<StatusEffect> CORRUPTED_GLITCHSTERII = EFFECTS.register("corrupted_glitchster2", CorruptedGlitchsterIIEffect::new);
    public static final RegistrySupplier<StatusEffect> CORRUPTED_GLITCHSTERIII = EFFECTS.register("corrupted_glitchster3", CorruptedGlitchsterIIIEffect::new);
    public static final RegistrySupplier<StatusEffect> ANTI_CORRUPTED_GLITCHSTER = EFFECTS.register("anti_corrupted_glitchster", AntiCorruptedGlitchsterEffect::new);

    public static final RegistrySupplier<StatusEffect> UNKILLABLE = EFFECTS.register("unkillable", UnkillableEffect::new);

    public static void registerModEffects() {
    }
}
