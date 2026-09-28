package org.greytss.terrain_testing;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

import org.greytss.terrain_testing.block.ModBlocks;
import org.greytss.terrain_testing.item.ModItems;
import org.slf4j.Logger;

@Mod(TerrainTesting.MODID)
public class TerrainTesting {
    public static final String MODID = "terrain_testing";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TerrainTesting(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }
}
