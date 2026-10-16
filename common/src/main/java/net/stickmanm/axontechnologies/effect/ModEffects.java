package net.stickmanm.axontechnologies.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.effect.custom.*;

public class ModEffects {

    public static final StatusEffect GLITCHSTER = new GlitchsterEffect();
    public static final StatusEffect GLITCHSTERII = new GlitchsterIIEffect();
    public static final StatusEffect GLITCHSTERIII = new GlitchsterIIIEffect();
    public static final StatusEffect GLITCHSTERIV = new GlitchsterIVEffect();
    public static final StatusEffect GLITCHSTERV = new GlitchsterVEffect();
    public static final StatusEffect GLITCHSTERX = new GlitchsterXEffect();
    public static final StatusEffect OVERDOSE = new OverdoseEffect();
    public static final StatusEffect NEUTRALIZED_GLITCHSTER = new NeutralizedGlitchsterEffect();
    public static final StatusEffect THUNDER_POISONING = new ThunderPoisoningEffect();

    public static final StatusEffect ANTIGLITCHSTER = new AntiGlitchsterEffect();
    public static final StatusEffect CORRUPTED_GLITCHSTER = new CorruptedGlitchsterEffect();
    public static final StatusEffect CORRUPTED_GLITCHSTERII = new CorruptedGlitchsterIIEffect();
    public static final StatusEffect CORRUPTED_GLITCHSTERIII = new CorruptedGlitchsterIIIEffect();
    public static final StatusEffect ANTI_CORRUPTED_GLITCHSTER = new AntiCorruptedGlitchsterEffect();

    public static final StatusEffect UNKILLABLE = new UnkillableEffect();

    public static void registerModEffects() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "glitchster"), GLITCHSTER);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "glitchster2"), GLITCHSTERII);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "glitchster3"), GLITCHSTERIII);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "glitchster4"), GLITCHSTERIV);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "glitchster5"), GLITCHSTERV);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "glitchx"), GLITCHSTERX);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "overdose"), OVERDOSE);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "neutralized_glitchster"), NEUTRALIZED_GLITCHSTER);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "corrupted_glitchster"), CORRUPTED_GLITCHSTER);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "corrupted_glitchster2"), CORRUPTED_GLITCHSTERII);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "corrupted_glitchster3"), CORRUPTED_GLITCHSTERIII);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "thunder_poisoning"), THUNDER_POISONING);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "antiglitchster"), ANTIGLITCHSTER);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "anti_corrupted_glitchster"), ANTI_CORRUPTED_GLITCHSTER);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "unkillable"), UNKILLABLE);

        AxonTechnologies.LOGGER.info("Registering ModEffects for " + AxonTechnologies.MOD_ID);
    }
}
