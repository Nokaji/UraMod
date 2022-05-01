package com.mod.uramod.proxy;

import com.mod.uramod.overlay.OverlayChestRadar;
import com.mod.uramod.proxy.client.CustomInGameMenu;

import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders(){}
    
    @Override
    public void registerOverlay() {
    	MinecraftForge.EVENT_BUS.register(new CustomInGameMenu());
        MinecraftForge.EVENT_BUS.register(new OverlayChestRadar());
    }
}
