package org.greytss.terrain_testing.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.greytss.terrain_testing.TerrainTesting;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.createItems(TerrainTesting.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
