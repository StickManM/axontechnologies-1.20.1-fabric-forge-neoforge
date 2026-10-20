package net.stickmanm.axontechnologies.item.custom;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.stickmanm.axontechnologies.effect.ModEffects;
import net.stickmanm.axontechnologies.item.ModItems;
import net.stickmanm.axontechnologies.item.client.DarkThunderaniumArmorRenderer;
import net.stickmanm.axontechnologies.item.client.ArmorClientHooks;
import net.stickmanm.axontechnologies.item.client.RedThunderaniumArmorRenderer;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class DarkThunderaniumArmorItem extends ArmorItem implements GeoItem {

    private final AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    // Fabric GeckoLib only (GeoItem.makeRenderer does not exist in the Forge build of GeckoLib)
    private Object renderProvider;


    public DarkThunderaniumArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }
    /**
     * Forge hook. Same erasure as Forge's Item#initializeClient(Consumer<IClientItemExtensions>), so Forge calls it on the client;
     * on Fabric nothing ever calls it. The Forge-only object is built in the forge module.
     */
    public void initializeClient(Consumer<Object> consumer) {
        Object extensions = ArmorClientHooks.createClientExtensions(() -> new DarkThunderaniumArmorRenderer());
        if (extensions != null)
            consumer.accept(extensions);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private DarkThunderaniumArmorRenderer renderer;


            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
                                                                        EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (this.renderer == null)
                    this.renderer = new DarkThunderaniumArmorRenderer();


                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);


                return this.renderer;
            }
        });

    }

    @Override
    public Supplier<Object> getRenderProvider() {
        return () -> {
            if (this.renderProvider == null)
                createRenderer(provider -> this.renderProvider = provider);
            return this.renderProvider;
        };
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController(this, "controller", 0, this::predicate));
    }
    private PlayState predicate(AnimationState animationState) {
        animationState.getController().setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }


    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {


        if(!world.isClient()) {
            if(entity instanceof PlayerEntity player) {
                ItemStack headPiece = player.getEquippedStack(EquipmentSlot.HEAD);
                ItemStack chestPiece = player.getEquippedStack(EquipmentSlot.CHEST);
                ItemStack legPiece = player.getEquippedStack(EquipmentSlot.LEGS);
                ItemStack footPiece = player.getEquippedStack(EquipmentSlot.FEET);




                if (headPiece.isOf(ModItems.DARK_THUNDERANIUM_HELMET.get()) &&
                        chestPiece.isOf(ModItems.DARK_THUNDERANIUM_CHESTPLATE.get()) &&
                        legPiece.isOf(ModItems.DARK_THUNDERANIUM_LEGGINGS.get()) &&
                        footPiece.isOf(ModItems.DARK_THUNDERANIUM_BOOTS.get())) {

                    if(player.hasStatusEffect(ModEffects.ANTIGLITCHSTER.get())) {
                        player.removeStatusEffect(ModEffects.GLITCHSTERIII.get());
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 2, false, false, true));
                        player.addStatusEffect(new StatusEffectInstance(ModEffects.NEUTRALIZED_GLITCHSTER.get(), 200, 0, false, false, true));
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 10, 1, false, false, false));
                    } else if (player.hasStatusEffect(ModEffects.GLITCHSTERX.get())) {
                        player.removeStatusEffect(ModEffects.GLITCHSTERIII.get());
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 10, 1, false, false, false));
                    } else {
                        player.addStatusEffect(new StatusEffectInstance(ModEffects.GLITCHSTERIII.get(), 200, 0, false, false, true));
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 2, false, false, true));

                    }

                  }
                }




    }

        super.inventoryTick(stack, world, entity, slot, selected);
    }




}
