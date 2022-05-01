package com.mod.uramod.init;

import com.mod.uramod.Reference;
import com.mod.uramod.UraMod;
import com.mod.uramod.blocks.BlockBasic;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockMod
{
    
    public static Block uranium_ore, uranium_block, noctanium_ore, noctanium_block, titan_ore, titan_block;
    
    public static void init()
    {
        uranium_ore = new BlockBasic(Material.rock, 2).setBlockName("uranium_ore").setCreativeTab(UraMod.UraMod).setBlockTextureName(Reference.MOD_ID + ":uranium_ore").setHardness(5.8F);
        uranium_block = new BlockBasic(Material.rock, 2).setBlockName("uranium_block").setCreativeTab(UraMod.UraMod).setBlockTextureName(Reference.MOD_ID + ":uranium_block").setHardness(7.5F);
        noctanium_ore = new BlockBasic(Material.rock, 2).setBlockName("noctanium_ore").setCreativeTab(UraMod.UraMod).setBlockTextureName(Reference.MOD_ID + ":noctanium_ore").setHardness(4.8F);
        noctanium_block = new BlockBasic(Material.rock, 2).setBlockName("noctanium_block").setCreativeTab(UraMod.UraMod).setBlockTextureName(Reference.MOD_ID + ":noctanium_block").setHardness(6.8F);
        titan_ore = new BlockBasic(Material.rock, 2).setBlockName("titan_ore").setCreativeTab(UraMod.UraMod).setBlockTextureName(Reference.MOD_ID + ":titan_ore").setHardness(5.6F);
        titan_block = new BlockBasic(Material.rock, 2).setBlockName("titan_block").setCreativeTab(UraMod.UraMod).setBlockTextureName(Reference.MOD_ID + ":titan_block").setHardness(6.5F);
    }
    
    public static void register()
    {
        //uraniumBlock
        GameRegistry.registerBlock(uranium_ore, uranium_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(uranium_block, uranium_block.getUnlocalizedName().substring(5));
        //NoctaniumBlock
        GameRegistry.registerBlock(noctanium_ore, noctanium_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(noctanium_block, noctanium_block.getUnlocalizedName().substring(5));
        //TitanBlock
        GameRegistry.registerBlock(titan_ore, titan_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(titan_block, titan_block.getUnlocalizedName().substring(5));
      	}
}
