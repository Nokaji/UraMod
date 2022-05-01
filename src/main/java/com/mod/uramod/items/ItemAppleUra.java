package com.mod.uramod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemAppleUra extends ItemFoodUra{

	public ItemAppleUra(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		// TODO Auto-generated constructor stub
	}
	
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
    {
		super.onFoodEaten(stack, world, player);
        player.addPotionEffect(new PotionEffect(Potion.heal.id, 660, 0));
        player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 660, 4));
        player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 660, 0));
        player.addPotionEffect(new PotionEffect(Potion.resistance.id, 660, 0));
        player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 660, 0));
    }

}
