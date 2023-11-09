package net.tissue.testmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.tissue.testmod.TestMod;
import net.tissue.testmod.entity.custom.IceSkeletonEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class IceSkeletonRenderer extends GeoEntityRenderer<IceSkeletonEntity> {
    public IceSkeletonRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new IceSkeletonModel());
    }

    @Override
    public ResourceLocation getTextureLocation(IceSkeletonEntity animatable) {
        return new ResourceLocation(TestMod.MOD_ID, "textures/entity/ice_skeleton_texture.png");
    }

    @Override
    public void render(IceSkeletonEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
