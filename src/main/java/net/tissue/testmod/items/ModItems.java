package net.tissue.testmod.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tissue.testmod.TestMod;
import net.tissue.testmod.entity.ModEntities;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> ICE_SKELETON_SPAWN_EGG = ITEMS.register("ice_skeleton_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.ICE_SKELETON, 0x90d9ff, 0x8a7bfa,
                    new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
