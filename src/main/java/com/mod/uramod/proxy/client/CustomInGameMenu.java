package com.mod.uramod.proxy.client;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import java.awt.Desktop;
import java.net.URI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraftforge.client.event.GuiScreenEvent;

public class CustomInGameMenu {
  private Minecraft mc;
  
  private int width;
  
  private int height;
  
  @SubscribeEvent
  public void onOpenEvent(GuiScreenEvent.InitGuiEvent event) {
    byte b0 = -16;
    if (event.gui instanceof GuiIngameMenu) {
      for (Object b : event.buttonList) {
        if (((GuiButton)b).id == 12)
          ((GuiButton)b).visible = true; 
        if (((GuiButton)b).id == 7)
          ((GuiButton)b).visible = true; 
      } 
      int i1 = event.gui.height / 4 + 58;
      event.buttonList.add(new GuiButton(25, event.gui.width / 2 - -2, i1 + 22, 98, 20, "Site Web") {
            public void func_146118_a(int x, int y) {
              if (Desktop.isDesktopSupported())
                try {
                  Desktop.getDesktop().browse(new URI("https://hellosky.yvleis.fr"));
                } catch (Exception e) {
                  e.printStackTrace();
                }  
            }
          });
    } 
  }
}
