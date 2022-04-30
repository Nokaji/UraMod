package com.mod.uramod.world;

import java.util.Random;

import com.mod.uramod.init.BlockMod;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenUraMod implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId)
        {
            case -1:
                GenerateNether(world, chunkX * 16, chunkZ * 16, random);
            case 0:
                GenerateOverWorld(world, chunkX * 16, chunkZ * 16, random);
            case 1:
                GenerateEnd(world, chunkX * 16, chunkZ * 16, random);
        }
    }
    
    private void addOre(Block block, Block blockspawn, Random random, World world, int posX, int posZ, int minY, int maxY,int minV, int maxV, int spawnChance)
    {
        for(int i = 0; i < spawnChance; i++)
            
        {
            int chunkSize = 16;
            int Xpos = posX + random.nextInt(chunkSize);
            int Ypos = minY + random.nextInt(maxY - minY);
            int Zpos = posZ + random.nextInt(chunkSize);
            
            new WorldGenMinable(block, maxV).generate(world, random, Xpos, Ypos, Zpos);
            
        }
    }
    private void GenerateEnd(World world, int i, int j, Random random)
    {
        
    }

    private void GenerateOverWorld(World world, int i, int j, Random random)
    {
        addOre(BlockMod.uranium_ore, Blocks.stone, random, world, i, j, 1, 12, 2, 5, 1);
        addOre(BlockMod.noctanium_ore, Blocks.stone, random, world, i, j, 1, 20, 4, 7, 2);
        addOre(BlockMod.titan_ore, Blocks.stone, random, world, i, j, 1, 25, 3, 6, 2);
    }

    private void GenerateNether(World world, int i, int j, Random random)
    {
        
    }
}
