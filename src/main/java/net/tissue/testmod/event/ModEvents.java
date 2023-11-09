package net.tissue.testmod.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tissue.testmod.TestMod;
import net.tissue.testmod.entity.ModEntities;
import net.tissue.testmod.entity.custom.IceSkeletonEntity;

@Mod.EventBusSubscriber(modid = TestMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.ICE_SKELETON.get(), IceSkeletonEntity.setAttributes());
    }
}
