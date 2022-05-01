package com.mod.uramod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftMod {
	public static void register() {
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_sword, 1), new Object[] { "X", "X", "J", 'x', ItemMod.uranium_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_pickaxe, 1), new Object[] { "XXX", " J ", " J ", 'x', ItemMod.uranium_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_shovel, 1), new Object[] { "X", "J", "J", 'x', ItemMod.uranium_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_axe, 1), new Object[] { "XX", "XJ", " J", 'x', ItemMod.uranium_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_helmet, 1), new Object[] { "XXX", "X X", 'x', ItemMod.uranium_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_chestplate, 1), new Object[] { "X X", "XXX", "XXX", 'x', ItemMod.uranium_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_leggins, 1), new Object[] { "XXX", "X X", "X X", 'x', ItemMod.uranium_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_boot, 1), new Object[] { "X X", "X X", 'x', ItemMod.uranium_ingot });
        GameRegistry.addRecipe(new ItemStack(BlockMod.uranium_block, 1), new Object[] { "XXX", "XXX", "XXX", 'x', ItemMod.uranium_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_ingot, 9), new Object[] { "X", 'x', BlockMod.uranium_block });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_stick, 4), new Object[] { "X", "X", 'x', ItemMod.uranium_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_apple, 1), new Object[] { "XXX", "XJX", "XXX", 'x', ItemMod.uranium_ingot, 'J', Items.golden_apple });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_hammer, 1), new Object[] { 
              "LXL", "BJB", " J ", 'x', ItemMod.uranium_ingot, 'J', Items.stick, 'L', ItemMod.uranium_core, 'B', 
              BlockMod.uranium_block });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_core_frag, 1), new Object[] { " X ", "XJX", " X ", 'x', BlockMod.uranium_block, 'J', ItemMod.uranium_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_core, 1), new Object[] { "JJJ", "XJX", "XXX", 'x', ItemMod.uranium_ingot, 'J', ItemMod.uranium_core_frag });
        GameRegistry.addRecipe(new ItemStack(ItemMod.uranium_key, 1), new Object[] { "CCC", "CJC", "CCC", 'C', ItemMod.uranium_core, 'J', ItemMod.uranium_ingot });
        GameRegistry.addRecipe(new ItemStack(BlockMod.noctanium_block, 1), new Object[] { "XXX", "XXX", "XXX", 'x', ItemMod.noctanium_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.noctanium_ingot, 9), new Object[] { "X", 'x', BlockMod.noctanium_block });
        GameRegistry.addRecipe(new ItemStack(ItemMod.noctanium_sword, 1), new Object[] { "X", "X", "J", 'x', ItemMod.noctanium_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.noctanium_helmet, 1), new Object[] { "XXX", "X X", 'x', ItemMod.noctanium_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.noctanium_chestplate, 1), new Object[] { "X X", "XXX", "XXX", 'x', ItemMod.noctanium_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.noctanium_leggins, 1), new Object[] { "XXX", "X X", "X X", 'x', ItemMod.noctanium_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.noctanium_boot, 1), new Object[] { "X X", "X X", 'x', ItemMod.noctanium_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.noctanium_sword, 1), new Object[] { "X", "X", "J", 'x', ItemMod.noctanium_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.noctanium_pickaxe, 1), new Object[] { "XXX", " J ", " J ", 'x', ItemMod.noctanium_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.noctanium_shovel, 1), new Object[] { "X", "J", "J", 'x', ItemMod.noctanium_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.noctanium_axe, 1), new Object[] { "XX", "XJ", " J", 'x', ItemMod.noctanium_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.noctanium_hammer, 1), new Object[] { "XXX", "XJX", " J ", 'x', ItemMod.noctanium_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.noctanium_key, 1), new Object[] { "CCC", "CJC", "CCC", 'C', ItemMod.uranium_core, 'J', ItemMod.noctanium_ingot });
        GameRegistry.addRecipe(new ItemStack(BlockMod.titan_block, 1), new Object[] { "XXX", "XXX", "XXX", 'x', ItemMod.titan_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.titan_ingot, 1), new Object[] { "X", 'x', BlockMod.titan_block });
        GameRegistry.addRecipe(new ItemStack(ItemMod.titan_helmet, 1), new Object[] { "XXX", "X X", 'x', ItemMod.titan_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.titan_chestplate, 1), new Object[] { "X X", "XXX", "XXX", 'x', ItemMod.titan_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.titan_leggins, 1), new Object[] { "XXX", "X X", "X X", 'X', ItemMod.titan_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.titan_boot, 1), new Object[] { "X X", "X X", 'X', ItemMod.titan_ingot });
        GameRegistry.addRecipe(new ItemStack(ItemMod.titan_sword, 1), new Object[] { "X", "X", "J", 'X', ItemMod.titan_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.titan_pickaxe, 1), new Object[] { "XXX", " J ", " J ", 'X', ItemMod.titan_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.titan_axe, 1), new Object[] { "XX", "XJ", " J", 'X', ItemMod.titan_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.titan_shovel, 1), new Object[] { "X", "J", "J", 'X', ItemMod.titan_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.titan_hammer, 1), new Object[] { "XXX", "XJX", " J ", 'X', ItemMod.titan_ingot, 'J', Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.unclaim_finder, 1), new Object[] { 
              "LXL", "KKK", "ARA", 'L', ItemMod.uranium_core, 'x', Items.compass, 'K', BlockMod.uranium_block, 'A', 
              ItemMod.uranium_ingot, 'R', Items.redstone });
        GameRegistry.addRecipe(new ItemStack(ItemMod.pickaxe_staff_of_power, 1), new Object[] { 
              "PSA", " J ", " J ", 'P', ItemMod.uranium_pickaxe, 'S', ItemMod.uranium_shovel, 'A', ItemMod.uranium_axe, 'J', 
              Items.stick });
        GameRegistry.addRecipe(new ItemStack(ItemMod.key_legendary, 1), new Object[] { "CBC", "UCU", "CBC", 'C', ItemMod.uranium_core, 'B', BlockMod.uranium_block, 'U', ItemMod.uranium_key });
     

	}
}
