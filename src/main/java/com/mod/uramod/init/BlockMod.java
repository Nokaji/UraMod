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
        GameRegistry.addRecipe(new ItemStack(ItemMod.stick_uranium, 4), new Object[] {"X  ","X  ","   ", 'X', ItemMod.uranium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.stick_uranium, 4), new Object[] {" X "," X ","   ", 'X', ItemMod.uranium_ingot});
        GameRegistry.addRecipe(new ItemStack(BlockMod.uranium_block, 1), new Object[] {"XXX","XXX","XXX", 'X', ItemMod.uranium_ingot});
        GameRegistry.addSmelting(BlockMod.uranium_ore, new ItemStack(ItemMod.uranium_ingot, 1), 1.0F);
        //NoctaniumBlock
        GameRegistry.registerBlock(noctanium_ore, noctanium_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(noctanium_block, noctanium_block.getUnlocalizedName().substring(5));
        //TitanBlock
        GameRegistry.registerBlock(titan_ore, titan_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(titan_block, titan_block.getUnlocalizedName().substring(5));
        GameRegistry.addRecipe(new ItemStack(BlockMod.titan_block, 1), new Object[] {"XXX","XXX","XXX", 'X', ItemMod.titan_ingot});
        GameRegistry.addSmelting(BlockMod.titan_ore, new ItemStack(ItemMod.titan_ingot, 1), 0.5F);
        GameRegistry.addSmelting(BlockMod.noctanium_ore, new ItemStack(ItemMod.noctanium_ingot, 1), 0.9F);
        GameRegistry.addRecipe(new ItemStack(BlockMod.noctanium_block, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ItemMod.noctanium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.noctanium_ingot, 9), new Object[] {"    ", " X ", "  ", 'X', BlockMod.noctanium_block});
        GameRegistry.addRecipe(new ItemStack(ItemMod.noctanium_ingot, 9), new Object[] {" X ", "  ", "  ", 'X', BlockMod.noctanium_block});
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_ingot, 9), new Object[] {" X ","  ","  ", 'X', BlockMod.uranium_block});
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_ingot, 9), new Object[] {"  "," X ","  ", 'X', BlockMod.uranium_block});
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_sword, 1), new Object[] {" X "," X "," J ", 'X', ItemMod.uranium_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_sword, 1), new Object[] {"  X","  X","  J", 'X', ItemMod.uranium_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_pickaxe, 1), new Object[] {"XXX"," J "," J ", 'X', ItemMod.uranium_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_axe, 1), new Object[] {"XX ","XJ "," J ", 'X', ItemMod.uranium_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.helmet_uranium, 1), new Object[] {"XXX", "X X", "   ", 'X', ItemMod.uranium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.chestplate_uranium, 1), new Object[] {"X X", "XXX", "XXX", 'X', ItemMod.uranium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.leggins_uranium, 1), new Object[] {"XXX", "X X", "X X", 'X', ItemMod.uranium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.boot_uranium, 1), new Object[] {"   ", "X X", "X X", 'X', ItemMod.uranium_ingot});
    }
}
