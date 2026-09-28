package org.greytss.terrain_testing.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.greytss.terrain_testing.TerrainTesting;


public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TerrainTesting.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {


    }

}
