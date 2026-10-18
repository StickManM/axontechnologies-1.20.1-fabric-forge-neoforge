package net.stickmanm.axontechnologies.item;


import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;

import javax.swing.text.TabSet;
import java.awt.*;

public class ModItemGroup {
    private static final DeferredRegister<ItemGroup> TABS = DeferredRegister.create(AxonTechnologiesConstants.MOD_ID, RegistryKeys.ITEM_GROUP);

    public static RegistrySupplier<ItemGroup> AXONTECHNOLOGIES;

    public static void initItemGroups() {
        AXONTECHNOLOGIES = TABS.register("axontechnologies", () -> CreativeTabRegistry.create(Text.translatable("itemGroup.axontechnologies"), () -> new ItemStack(ModItems.RED_THUNDERANIUM_INGOT.get())));

        TABS.register();
    }
}

