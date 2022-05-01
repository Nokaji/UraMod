package com.mod.uramod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class SmeltingMod {
	public static void register() {
		GameRegistry.addSmelting(BlockMod.titan_ore, new ItemStack(ItemMod.titan_ingot, 1), 0.5F);
        GameRegistry.addSmelting(BlockMod.noctanium_ore, new ItemStack(ItemMod.noctanium_ingot, 1), 0.9F);
        GameRegistry.addSmelting(BlockMod.uranium_ore, new ItemStack(ItemMod.uranium_ingot, 1), 1.0F);
    }
}
