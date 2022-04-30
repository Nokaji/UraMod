package com.mod.uramod.items;

import com.mod.uramod.Reference;
import com.mod.uramod.init.ItemMod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorUra extends ItemArmor
{

    public ItemArmorUra(ArmorMaterial material, int metadata)
    {
        super(material, 0,  metadata);
    }
    
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ItemMod.leggins_uranium)
        {
            return Reference.MOD_ID + ":textures/models/armor/uraniumarmor_layer_2.png";
        }
        else if(stack.getItem() == ItemMod.helmet_uranium || stack.getItem() == ItemMod.chestplate_uranium || stack.getItem() == ItemMod.boot_uranium)
        {
            return Reference.MOD_ID + ":textures/models/armor/uraniumarmor_layer_1.png";
        }
        return null;
    }
} 
