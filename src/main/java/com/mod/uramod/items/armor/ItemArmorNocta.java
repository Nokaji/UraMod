package com.mod.uramod.items.armor;

import com.mod.uramod.init.ItemMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorNocta extends ItemArmor{
	public ItemArmorNocta(ItemArmor.ArmorMaterial material, int metadata) {
	    super(material, 0, metadata);
	  }
	  
	  public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
	    if (stack.getItem() == ItemMod.noctanium_leggins)
	      return "uramod:textures/models/armor/noctaniumarmor_layer_2.png"; 
	    if (stack.getItem() == ItemMod.noctanium_helmet || stack.getItem() == ItemMod.noctanium_chestplate || stack.getItem() == ItemMod.noctanium_boot)
	      return "uramod:textures/models/armor/noctaniumarmor_layer_1.png"; 
	    return null;
	  }
	  
	  public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	    if (this == ItemMod.noctanium_helmet)
	      player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 250, 0)); 
	    if (this == ItemMod.noctanium_leggins)
	      player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 250, 0)); 
	  }
}
