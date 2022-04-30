package com.mod.uramod.items;

import com.mod.uramod.init.BlockMod;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemUraHammer extends ItemPickaxe
{

    public ItemUraHammer(ToolMaterial material)
    {
        super(material);
    }
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float px, float py, float pz)
    {
        boolean isCobble =  world.getBlock(x, y, z) == Blocks.cobblestone;
        boolean isStone = world.getBlock(x, y, z) == Blocks.stone;
        boolean isStoneBrick = world.getBlock(x, y, z) == Blocks.stonebrick;
        if(isCobble || isStone || isStoneBrick){

            for (int ix = -1; x < 2; x++) {
                for (int iy = -1; x < 2; x++) {
                    for (int iz = -1; x < 2; x++) {
                        world.func_147480_a(x + ix, y + iy, z + iz, true);
                    }
                }
            }
            return true;
        }
        else
        {
            System.out.println("[FergoTools] False");
            return false;
        }
    }
}
