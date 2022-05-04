package com.mod.uramod.proxy;

import java.nio.ByteBuffer;

import org.lwjgl.opengl.Display;

import com.ibm.icu.impl.duration.impl.Utils;
import com.mod.uramod.Reference;
import com.mod.uramod.overlay.OverlayChestRadar;
import com.mod.uramod.proxy.client.CustomInGameMenu;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{
	private Minecraft mc;
    @Override
    public void registerRenders(){
    	
    }


	@Override
    public void registerOverlay() {
    	MinecraftForge.EVENT_BUS.register(new CustomInGameMenu());
        MinecraftForge.EVENT_BUS.register(new OverlayChestRadar());
    }
}
