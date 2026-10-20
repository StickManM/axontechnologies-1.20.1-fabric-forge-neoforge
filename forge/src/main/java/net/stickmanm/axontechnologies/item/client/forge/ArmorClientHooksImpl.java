package net.stickmanm.axontechnologies.item.client.forge;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Supplier;

public class ArmorClientHooksImpl {
    public static Object createClientExtensions(Supplier<Object> rendererFactory) {
        return new IClientItemExtensions() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
                                                                      EquipmentSlot equipmentSlot, BipedEntityModel<?> original) {
                if (this.renderer == null)
                    this.renderer = (GeoArmorRenderer<?>) rendererFactory.get();

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                return this.renderer;
            }
        };
    }
}
