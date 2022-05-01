package com.mod.uramod.init;

import javax.tools.Tool;

import com.mod.uramod.Reference;
import com.mod.uramod.UraMod;
import com.mod.uramod.items.ItemAppleUra;
import com.mod.uramod.items.ItemChestRadar;
import com.mod.uramod.items.ItemUnclaimFinder;
import com.mod.uramod.items.armor.ItemArmorNocta;
import com.mod.uramod.items.armor.ItemArmorTitan;
import com.mod.uramod.items.armor.ItemArmorUra;
import com.mod.uramod.items.tools.ItemAxeUra;
import com.mod.uramod.items.tools.ItemPickaxeUra;
import com.mod.uramod.items.tools.ItemShovelUra;
import com.mod.uramod.items.tools.ItemStaffUra;
import com.mod.uramod.items.tools.ItemSwordUra;
import com.mod.uramod.items.tools.ItemUraHammer;

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
    public static ToolMaterial toolnoob = EnumHelper.addToolMaterial("toolnoob", 0, 0, 0, 1, 0);
    public static Item.ToolMaterial toolStaff = EnumHelper.addToolMaterial("toolStaff", 6, 5000, 25.0F, 10.0F, 0);
    
    public static ToolMaterial toolUra = EnumHelper.addToolMaterial("toolUra", 5, 3800, 20.0F, 6.0F, 18);
    
    public static ToolMaterial toolNocta = EnumHelper.addToolMaterial("toolNocta", 4, 3500, 15.0F, 5.0F, 15);
    
    public static ArmorMaterial armorUra = EnumHelper.addArmorMaterial("armorUra", 320, new int[] { 4, 7, 5, 6 }, 21);
    
    public static Item.ToolMaterial toolTitan = EnumHelper.addToolMaterial("toolTitan", 3, 3000, 10.0F, 4.0F, 14);
    
    public static ArmorMaterial armorNocta = EnumHelper.addArmorMaterial("armorNocta", 190, new int[] { 4, 5, 5, 4 }, 21);
    
    public static ArmorMaterial armorTitan = EnumHelper.addArmorMaterial("armorTitan", 160, new int[] { 2, 7, 2, 1 }, 19);
    
    public static Item 
    uranium_ingot, 
    uranium_stick, 
    uranium_pickaxe, 
    uranium_sword, 
    uranium_axe, 
    uranium_shovel, 
    uranium_helmet, 
    uranium_chestplate, 
    uranium_leggins, 
    uranium_boot, 
    noctanium_ingot, 
    titan_ingot, 
    uranium_hammer,
    unclaim_finder,
    uranium_core,
    uranium_core_frag,
    uranium_apple,
    key_legendary,
    uranium_key,
    noctanium_helmet,
    noctanium_chestplate,
    noctanium_leggins,
    noctanium_sword,
    noctanium_boot,
    noctanium_pickaxe,
    noctanium_axe,
    noctanium_shovel,
    noctanium_hammer,
    noctanium_key,
    titan_helmet,
    titan_chestplate,
    titan_leggins,
    titan_boot,
    titan_sword,
    titan_pickaxe,
    titan_axe,
    titan_shovel,
    titan_hammer,
    pickaxe_staff_of_power;
    
    public static void init()
    {
    	uranium_ingot = new Item().setUnlocalizedName("uranium_ingot").setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":uranium_ingot");
        uranium_pickaxe = new ItemPickaxeUra(toolUra).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":uranium_pickaxe").setUnlocalizedName("uranium_pickaxe");
        uranium_sword = new ItemSwordUra(toolUra).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":uranium_sword").setUnlocalizedName("uranium_sword");
        uranium_axe = new ItemAxeUra(toolUra).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":uranium_axe").setUnlocalizedName("uranium_axe");
        uranium_shovel = new ItemShovelUra(toolUra).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":uranium_shovel").setUnlocalizedName("uranium_shovel");
        uranium_stick = new Item().setFull3D().setUnlocalizedName("uranium_stick").setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":uranium_stick");
        uranium_helmet = new ItemArmorUra(armorUra, 0).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":uranium_helmet").setUnlocalizedName("uranium_helmet");
        uranium_chestplate = new ItemArmorUra(armorUra, 1).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":uranium_chestplate").setUnlocalizedName("uranium_chestplate");
        uranium_leggins = new ItemArmorUra(armorUra, 2).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":uranium_leggins").setUnlocalizedName("uranium_leggins");
        uranium_boot = new ItemArmorUra(armorUra, 3).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":uranium_boot").setUnlocalizedName("uranium_boot");
        uranium_hammer = new ItemUraHammer(toolUra).setUnlocalizedName("uranium_hammer").setTextureName(Reference.MOD_ID + ":uranium_hammer").setCreativeTab(UraMod.UraMod);
        uranium_apple = new ItemAppleUra(3, 0.0F, false).setAlwaysEdible().setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":uranium_apple").setUnlocalizedName("uranium_apple");
        uranium_core = new Item().setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":uranium_core").setUnlocalizedName("uranium_core");
        uranium_core_frag = new Item().setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":uranium_core_frag").setUnlocalizedName("uranium_core_frag");
        uranium_key = new Item().setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":uranium_key").setUnlocalizedName("uranium_key");
        noctanium_ingot = new Item().setUnlocalizedName("noctanium_ingot").setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":noctanium_ingot");
        noctanium_helmet = new ItemArmorNocta(armorNocta, 0).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":noctanium_helmet").setUnlocalizedName("noctanium_helmet");
        noctanium_chestplate = new ItemArmorNocta(armorNocta, 1).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":noctanium_chestplate").setUnlocalizedName("noctanium_chestplate");
        noctanium_leggins = new ItemArmorNocta(armorNocta, 2).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":noctanium_leggins").setUnlocalizedName("noctanium_leggins");
        noctanium_boot = new ItemArmorNocta(armorNocta, 3).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":noctanium_boot").setUnlocalizedName("noctanium_boot");
        noctanium_sword = new ItemSwordUra(toolNocta).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":noctanium_sword").setUnlocalizedName("noctanium_sword");
        noctanium_pickaxe = new ItemPickaxeUra(toolNocta).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":noctanium_pickaxe").setUnlocalizedName("noctanium_pickaxe");
        noctanium_axe = new ItemAxeUra(toolNocta).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":noctanium_axe").setUnlocalizedName("noctanium_axe");
        noctanium_shovel = new ItemShovelUra(toolNocta).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":noctanium_shovel").setUnlocalizedName("noctanium_shovel");
        noctanium_hammer = new ItemUraHammer(toolNocta).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":noctanium_hammer").setUnlocalizedName("noctanium_hammer");
        noctanium_key = new Item().setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":noctanium_key").setUnlocalizedName("noctanium_key");
        titan_ingot = new Item().setUnlocalizedName("titan_ingot").setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":titan_ingot");
        titan_helmet = new ItemArmorTitan(armorTitan, 0).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":titan_helmet").setUnlocalizedName("titan_helmet");
        titan_chestplate = new ItemArmorTitan(armorTitan, 1).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":titan_chestplate").setUnlocalizedName("titan_chestplate");
        titan_leggins = new ItemArmorTitan(armorTitan, 2).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":titan_leggins").setUnlocalizedName("titan_leggins");
        titan_boot = new ItemArmorTitan(armorTitan, 3).setCreativeTab(UraMod.UraArmor).setTextureName(Reference.MOD_ID + ":titan_boot").setUnlocalizedName("titan_boot");
        titan_sword = new ItemSwordUra(toolTitan).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":titan_sword").setUnlocalizedName("titan_sword");
        titan_pickaxe = new ItemPickaxeUra(toolTitan).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":titan_pickaxe").setUnlocalizedName("titan_pickaxe");
        titan_axe = new ItemAxeUra(toolTitan).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":titan_axe").setUnlocalizedName("titan_axe");
        titan_shovel = new ItemShovelUra(toolTitan).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":titan_shovel").setUnlocalizedName("titan_shovel");
        titan_hammer = new ItemUraHammer(toolTitan).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":titan_hammer").setUnlocalizedName("titan_hammer");
        unclaim_finder = new ItemUnclaimFinder().setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":unclaim_finder").setUnlocalizedName("unclaim_finder");
        pickaxe_staff_of_power = new ItemStaffUra(toolStaff).setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":pickaxe_staff_of_power").setUnlocalizedName("pickaxe_staff_of_power");
        key_legendary = new Item().setCreativeTab(UraMod.UraMod).setTextureName(Reference.MOD_ID + ":key_legendary").setUnlocalizedName("key_legendary");
    }
    
    public static void register()
    {
    	GameRegistry.registerItem(uranium_ingot, "uranium_ingot");
        GameRegistry.registerItem(uranium_stick, "uranium_stick");
        GameRegistry.registerItem(uranium_pickaxe, "uranium_pickaxe");
        GameRegistry.registerItem(uranium_sword, "uranium_sword");
        GameRegistry.registerItem(uranium_axe, "uranium_axe");
        GameRegistry.registerItem(uranium_shovel, "uranium_shovel");
        GameRegistry.registerItem(uranium_helmet, "uranium_helmet");
        GameRegistry.registerItem(uranium_chestplate, "uranium_chestplate");
        GameRegistry.registerItem(uranium_leggins, "uranium_leggins");
        GameRegistry.registerItem(uranium_boot, "uranium_boot");
        GameRegistry.registerItem(uranium_apple, "uranium_apple");
        GameRegistry.registerItem(uranium_hammer, "uranium_hammer");
        GameRegistry.registerItem(uranium_core_frag, "uranium_core_frag");
        GameRegistry.registerItem(uranium_core, "uranium_core");
        GameRegistry.registerItem(uranium_key, "uranium_key");
        GameRegistry.registerItem(noctanium_ingot, "noctanium_ingot");
        GameRegistry.registerItem(noctanium_helmet, "noctanium_helmet");
        GameRegistry.registerItem(noctanium_chestplate, "noctanium_chestplate");
        GameRegistry.registerItem(noctanium_leggins, "noctanium_leggins");
        GameRegistry.registerItem(noctanium_boot, "noctanium_boot");
        GameRegistry.registerItem(noctanium_sword, "noctanium_sword");
        GameRegistry.registerItem(noctanium_pickaxe, "noctanium_pickaxe");
        GameRegistry.registerItem(noctanium_axe, "noctanium_axe");
        GameRegistry.registerItem(noctanium_shovel, "noctanium_shovel");
        GameRegistry.registerItem(noctanium_hammer, "noctanium_hammer");
        GameRegistry.registerItem(noctanium_key, "noctanium_key");
        GameRegistry.registerItem(titan_ingot, "titan_ingot");
        GameRegistry.registerItem(titan_helmet, "titan_helmet");
        GameRegistry.registerItem(titan_chestplate, "titan_chestplate");
        GameRegistry.registerItem(titan_leggins, "titan_leggins");
        GameRegistry.registerItem(titan_boot, "titan_boot");
        GameRegistry.registerItem(titan_sword, "titan_sword");
        GameRegistry.registerItem(titan_pickaxe, "titan_pickaxe");
        GameRegistry.registerItem(titan_axe, "titan_axe");
        GameRegistry.registerItem(titan_shovel, "titan_shovel");
        GameRegistry.registerItem(titan_hammer, "titan_hammer");
        GameRegistry.registerItem(pickaxe_staff_of_power, "pickaxe_staff_of_power");
        GameRegistry.registerItem(unclaim_finder, "unclaim_finder");
        GameRegistry.registerItem(key_legendary, "key_legendary");
    }
}
