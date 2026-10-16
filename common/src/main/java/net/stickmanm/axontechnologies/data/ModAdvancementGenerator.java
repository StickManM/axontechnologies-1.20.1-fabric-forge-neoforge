package net.stickmanm.axontechnologies.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.stickmanm.axontechnologies.util.ModAdvancements;

import java.util.function.Consumer;

public class ModAdvancementGenerator extends FabricAdvancementProvider {
    public ModAdvancementGenerator(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        new ModAdvancements().accept(consumer);
    }
}
