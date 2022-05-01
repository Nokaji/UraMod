package com.mod.uramod.items.tools;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mod.uramod.init.BlockMod;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemStaffUra extends ItemPickaxe{
	public ItemStaffUra(Item.ToolMaterial p_i45347_1_) {
	    super(p_i45347_1_);
	  }
	  
	private static Set<Block> effectivaAgainst = Sets.newHashSet((Block[])new Block[] { Blocks.stone, (Block)Blocks.grass, (Block)Blocks.sand, Blocks.gravel, Blocks.clay, Blocks.cobblestone, Blocks.dirt, BlockMod.uranium_ore, BlockMod.titan_ore, BlockMod.noctanium_ore });
	  
	  public Set<String> getToolClasses(ItemStack stack) {
	    return (Set<String>)ImmutableSet.of("pickaxe", "spade", "axe");
	  }
	  
	  public boolean canHarvestBlock(Block block, ItemStack stack) {
	    return effectivaAgainst.contains(block) ? true : super.canHarvestBlock(block, stack);
	  }
	  
	  public float func_150893_a(ItemStack stack, Block block) {
	    return effectivaAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.func_150893_a(stack, block);
	  }
}
