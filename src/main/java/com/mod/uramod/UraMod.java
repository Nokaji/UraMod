package com.mod.uramod;

import org.lwjgl.opengl.Display;

import com.mod.uramod.init.BlockMod;
import com.mod.uramod.init.CraftMod;
import com.mod.uramod.init.ItemMod;
import com.mod.uramod.init.SmeltingMod;
import com.mod.uramod.proxy.CommonProxy;
import com.mod.uramod.proxy.client.CustomInGameMenu;
import com.mod.uramod.proxy.client.GuiCustomMainMenu;
import com.mod.uramod.world.WorldRegister;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
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
            return ItemMod.uranium_chestplate;
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
        CraftMod.register();
        SmeltingMod.register();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
        proxy.registerOverlay();
        if (event.getSide().isClient()){
            FMLCommonHandler.instance().bus().register(this); 
        }
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onTick(TickEvent.ClientTickEvent event) {
      Minecraft mc = FMLClientHandler.instance().getClient();
      Display.setTitle("HelloSkyV4 | " + mc.getSession().getUsername());
    }
}