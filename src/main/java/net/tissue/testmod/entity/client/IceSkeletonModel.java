package net.tissue.testmod.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.tissue.testmod.TestMod;
import net.tissue.testmod.entity.custom.IceSkeletonEntity;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class IceSkeletonModel extends GeoModel<IceSkeletonEntity> {
    @Override
    public ResourceLocation getModelResource(IceSkeletonEntity animatable) {
        return new ResourceLocation(TestMod.MOD_ID, "geo/ice_skeleton.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IceSkeletonEntity animatable) {
        return new ResourceLocation(TestMod.MOD_ID, "textures/entity/ice_skeleton_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IceSkeletonEntity animatable) {
        return new ResourceLocation(TestMod.MOD_ID, "animations/ice_skeleton.animation.json");
    }

    @Override
    public void setCustomAnimations(IceSkeletonEntity animatable, long instanceId, AnimationState<IceSkeletonEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
