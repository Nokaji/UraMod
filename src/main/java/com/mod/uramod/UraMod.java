package com.mod.uramod;

import com.mod.uramod.init.BlockMod;
import com.mod.uramod.init.ItemMod;
import com.mod.uramod.proxy.CommonProxy;
import com.mod.uramod.world.WorldRegister;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.gen.feature.WorldGenMinable;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class UraMod
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;
    
    public static CreativeTabs UraMod = new CreativeTabs("UraMod") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return ItemMod.uranium_ingot;
        }
    };
    public static CreativeTabs UraArmor = new CreativeTabs("UraArmor") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return ItemMod.helmet_uranium;
        }
    };
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ItemMod.init();
        ItemMod.register();
        BlockMod.init();
        BlockMod.register();
        WorldRegister.MainRegstry();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}