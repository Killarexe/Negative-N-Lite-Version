package net.killarexe.negative_n.register;

import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.killarexe.negative_n.util.world.biome.OakNForest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class NegativeNBiomes {

    static String MODID = "negative_n";

    public static final RegistryKey<Biome> OAK_N_FOREST_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MODID, "oak_n_forest"));

    public static void register(){
        registerBiome(OAK_N_FOREST_KEY, OakNForest.GRASS_BLOCK_N_SURFACE_BUILDER, OakNForest.OAK_N_FOREST, "oak_n_forest");
        OverworldBiomes.addContinentalBiome(OAK_N_FOREST_KEY, OverworldClimate.TEMPERATE, 2D);
        OverworldBiomes.addContinentalBiome(OAK_N_FOREST_KEY, OverworldClimate.COOL, 2D);
    }

    private static void registerBiome(RegistryKey<Biome> key, ConfiguredSurfaceBuilder<TernarySurfaceConfig> surfaceBuilder, Biome biome, String id){
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier(MODID, id), surfaceBuilder);
        Registry.register(BuiltinRegistries.BIOME, key.getValue(), biome);
    }
}