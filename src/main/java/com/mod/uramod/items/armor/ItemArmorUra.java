package com.mod.uramod.items.armor;

import com.mod.uramod.Reference;
import com.mod.uramod.init.ItemMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorUra extends ItemArmor
{

	public ItemArmorUra(ItemArmor.ArmorMaterial material, int metadata) {
	    super(material, 0, metadata);
	  }
	  
	  public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
	    if (stack.getItem() == ItemMod.uranium_leggins)
	      return "uramod:textures/models/armor/uraniumarmor_layer_2.png"; 
	    if (stack.getItem() == ItemMod.uranium_helmet || stack.getItem() == ItemMod.uranium_chestplate || stack.getItem() == ItemMod.uranium_boot)
	      return "uramod:textures/models/armor/uraniumarmor_layer_1.png"; 
	    return null;
	  }
	  
	  public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	    if (this == ItemMod.uranium_helmet)
	      player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 660, 0)); 
	    if (this == ItemMod.uranium_chestplate)
	      player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 660, 0)); 
	    if (this == ItemMod.uranium_leggins)
	      player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 660, 0)); 
	    if (this == ItemMod.uranium_boot)
	      player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 660, 0)); 
	  }
} 
