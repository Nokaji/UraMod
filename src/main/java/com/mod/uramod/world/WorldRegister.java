package com.mod.uramod.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister
{
    public static void MainRegstry()
    {
        registerWorldGen(new WorldGenUraMod(), -1);
        registerWorldGen(new WorldGenUraMod(), 0);
        registerWorldGen(new WorldGenUraMod(), 1);
        
    }
    public static void registerWorldGen(IWorldGenerator iGenerator, int probability)
    {
        GameRegistry.registerWorldGenerator(iGenerator, probability);
    }
}
