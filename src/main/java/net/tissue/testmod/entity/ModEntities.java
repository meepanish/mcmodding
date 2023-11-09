package net.tissue.testmod.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tissue.testmod.TestMod;
import net.tissue.testmod.entity.custom.IceSkeletonEntity;

import javax.swing.text.html.parser.Entity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TestMod.MOD_ID);

    public static final RegistryObject<EntityType<IceSkeletonEntity>> ICE_SKELETON =
            ENTITY_TYPES.register("ice_skeleton",
                    () -> EntityType.Builder.of(IceSkeletonEntity::new, MobCategory.MONSTER)
                            .sized(1.0f, 3.0f)
                            .build(new ResourceLocation(TestMod.MOD_ID, "ice_skeleton").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}