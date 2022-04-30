package com.mod.uramod.init;

import javax.tools.Tool;

import com.mod.uramod.Reference;
import com.mod.uramod.UraMod;
import com.mod.uramod.items.ItemArmorUra;
import com.mod.uramod.items.ItemAxeUra;
import com.mod.uramod.items.ItemPickaxeUra;
import com.mod.uramod.items.ItemShovelUra;
import com.mod.uramod.items.ItemSwordUra;
import com.mod.uramod.items.ItemUraHammer;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMod
{
    public static ToolMaterial toolUra = EnumHelper.addToolMaterial("toolUra", 5, 3800, 25, 6, 18);
    public static ToolMaterial toolNocta = EnumHelper.addToolMaterial("toolUra", 5, 3800, 25, 6, 18);
    public static ArmorMaterial armorUra = EnumHelper.addArmorMaterial("armorUra", 3000, new int[] {1, 4, 3, 2}, 50);
    public static ToolMaterial toolnoob = EnumHelper.addToolMaterial("toolnoob", 0, 0, 0, 1, 0);
    
    public static Item uranium_ingot, stick_uranium, uranium_pickaxe, uranium_sword, uranium_axe, uranium_shovel, helmet_uranium, chestplate_uranium, leggins_uranium, boot_uranium, noctanium_ingot, titan_ingot, uranium_hammer;
    
    public static void init()
    {
        //UraniumItem
        uranium_ingot = new Item().setUnlocalizedName("uranium_ingot").setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":uranium_ingot");
        noctanium_ingot = new Item().setUnlocalizedName("noctanium_ingot").setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":noctanium_ingot");
        uranium_pickaxe = new ItemPickaxeUra(toolUra).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":uranium_pickaxe").setUnlocalizedName("uranium_pickaxe");
        uranium_sword = new ItemSwordUra(ItemMod.toolUra).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":uranium_sword").setUnlocalizedName("uranium_sword");
        uranium_axe = new ItemAxeUra(ItemMod.toolUra).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":uranium_axe").setUnlocalizedName("uranium_axe");
        uranium_shovel = new ItemShovelUra(ItemMod.toolUra).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":uranium_shovel").setUnlocalizedName("uranium_shovel");
        stick_uranium = new Item().setFull3D().setUnlocalizedName("stick_uranium").setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":stick_uranium");
        helmet_uranium = new ItemArmorUra(armorUra, 0).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":helmet_uranium").setUnlocalizedName("helmet_uranium");
        chestplate_uranium = new ItemArmorUra(armorUra, 1).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":chestplate_uranium").setUnlocalizedName("chestplate_uranium");
        leggins_uranium = new ItemArmorUra(armorUra, 2).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":leggins_uranium").setUnlocalizedName("leggins_uranium");
        boot_uranium = new ItemArmorUra(armorUra, 3).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":boot_uranium").setUnlocalizedName("boot_uranium");
        titan_ingot = new Item().setUnlocalizedName("titan_ingot").setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":titan_ingot");
        uranium_hammer = new ItemUraHammer(ItemMod.toolUra).setUnlocalizedName("uranium_hammer").setTextureName(":uranium_hammer").setCreativeTab(UraMod.UraMod);
        //NoctaniumItem
        
    }
    
    public static void register()
    {
        GameRegistry.registerItem(uranium_ingot, "uranium_ingot");
        GameRegistry.registerItem(stick_uranium, "stick_uranium");
        GameRegistry.registerItem(uranium_pickaxe, "uranium_pickaxe");
        GameRegistry.registerItem(uranium_sword, "uranium_sword");
        GameRegistry.registerItem(uranium_axe, "uranium_axe");
        GameRegistry.registerItem(uranium_shovel, "uranium_shovel");
        GameRegistry.registerItem(helmet_uranium, "helmet_uranium");
        GameRegistry.registerItem(chestplate_uranium, "chestplate_uranium");
        GameRegistry.registerItem(leggins_uranium, "leggins_uranium");
        GameRegistry.registerItem(boot_uranium, "boot_uranium");
        GameRegistry.registerItem(noctanium_ingot, "noctanium_ingot");
        GameRegistry.registerItem(titan_ingot, "titan_ingot");
        GameRegistry.registerItem(uranium_hammer, "uranium_hammer");
    }
}
