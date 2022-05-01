package com.mod.uramod.items.armor;

import com.mod.uramod.init.ItemMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorTitan extends ItemArmor{
	public ItemArmorTitan(ItemArmor.ArmorMaterial material, int metadata) {
	    super(material, 0, metadata);
	  }
	  
	  public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
	    if (stack.getItem() == ItemMod.titan_leggins)
	      return "uramod:textures/models/armor/titanarmor_layer_2.png"; 
	    if (stack.getItem() == ItemMod.titan_helmet || stack.getItem() == ItemMod.titan_chestplate || stack.getItem() == ItemMod.titan_boot)
	      return "uramod:textures/models/armor/titanarmor_layer_1.png"; 
	    return null;
	  }
	  
	  public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack ) {
		  if(this == ItemMod.uranium_helmet) {
			  player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 660, 0));
		  }
	  }
}
