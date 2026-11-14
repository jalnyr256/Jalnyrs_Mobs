package net.jalnyr.jalnyrsmobs.datagen;

import net.jalnyr.jalnyrsmobs.Jalnyrsmobs;
import net.jalnyr.jalnyrsmobs.item.ModItems;

import net.minecraft.data.PackOutput;

import net.minecraftforge.client.model.generators.ItemModelProvider;

import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Jalnyrsmobs.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerModels() {

        basicItem(ModItems.DRUGD_LEG.get());

        withExistingParent(ModItems.DRUGD_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.CORRUPTED_GUARD_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }
}
