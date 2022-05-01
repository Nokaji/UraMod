package com.mod.uramod.overlay;

import net.minecraft.client.Minecraft;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.GL11;

public class DisplayHelper {
	static Minecraft mc ;
	 
    public static void drawTexturedModalRect(int par1, int par2, float z, int par3, int par4, int par5, int par6) {
        drawTexturedModalRect(par1, par2, z, par3, par4, par5, par6, 0.00390625F, 0.00390625F);
    }
 
    public static void drawTexturedModalRect(int par1, int par2, float z, int par3, int par4, int par5, int par6,
            float f, float f1) {
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(par1 + 0, par2 + par6, z, (par3 + 0) * f, (par4 + par6) * f1);
        tessellator.addVertexWithUV(par1 + par5, par2 + par6, z, (par3 + par5) * f, (par4 + par6) * f1);
        tessellator.addVertexWithUV(par1 + par5, par2 + 0, z, (par3 + par5) * f, (par4 + 0) * f1);
        tessellator.addVertexWithUV(par1 + 0, par2 + 0, z, (par3 + 0) * f, (par4 + 0) * f1);
        tessellator.draw();
    }
 
    public static void renderEntity(int x, int y, int scale, float rotX, float rotY, EntityLivingBase entity,
            boolean nametag) {
        GL11.glEnable(2903);
        GL11.glPushMatrix();
        GL11.glTranslatef(x, y, 50.0F);
        GL11.glScalef(-scale, scale, scale);
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        float f2 = entity.renderYawOffset;
        float f3 = entity.rotationYaw;
        float f4 = entity.rotationPitch;
        float f5 = entity.prevRotationYawHead;
        float f6 = entity.rotationYawHead;
        GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-(float) Math.atan(rotY / 40.0F) * 20.0F, 1.0F, 0.0F, 0.0F);
        entity.renderYawOffset = ((float) Math.atan(rotX / 40.0F) * 20.0F);
        entity.rotationYaw = ((float) Math.atan(rotX / 40.0F) * 40.0F);
        entity.rotationPitch = (-(float) Math.atan(rotY / 40.0F) * 20.0F);
        entity.rotationYawHead = entity.rotationYaw;
        entity.prevRotationYawHead = entity.rotationYaw;
        GL11.glTranslatef(0.0F, entity.yOffset, 0.0F);
        RenderManager.instance.playerViewY = 180.0F;
        RenderManager.instance.renderEntityWithPosYaw(entity, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
        entity.renderYawOffset = f2;
        entity.rotationYaw = f3;
        entity.rotationPitch = f4;
        entity.prevRotationYawHead = f5;
        entity.rotationYawHead = f6;
        GL11.glPopMatrix();
        GL11.glDisable(32826);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glDisable(3553);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }
 
    public static void drawTexturedQuadFit(double x, double y, double width, double height, double zLevel) {
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(x + 0.0D, y + height, zLevel, 0.0D, 1.0D);
        tessellator.addVertexWithUV(x + width, y + height, zLevel, 1.0D, 1.0D);
        tessellator.addVertexWithUV(x + width, y + 0.0D, zLevel, 1.0D, 0.0D);
        tessellator.addVertexWithUV(x + 0.0D, y + 0.0D, zLevel, 0.0D, 0.0D);
        tessellator.draw();
    }
 
    public static void renderFloatingText(String text, float x, float y, float z, int color) {
        RenderManager renderManager = RenderManager.instance;
        FontRenderer fontRenderer = mc.fontRenderer;
        float scale = 0.027F;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
        GL11.glPushMatrix();
        GL11.glTranslatef(x + 0.0F, y + 2.3F, z);
        GL11.glNormal3f(0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
        GL11.glScalef(-scale, -scale, scale);
        GL11.glDisable(2896);
        GL11.glDepthMask(false);
        GL11.glDisable(2929);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        Tessellator tessellator = Tessellator.instance;
        int yOffset = 0;
 
        GL11.glDisable(3553);
        tessellator.startDrawingQuads();
        int stringMiddle = fontRenderer.getStringWidth(text) / 2;
        tessellator.setColorRGBA_F(0.0F, 0.0F, 0.0F, 0.5F);
        tessellator.addVertex(-stringMiddle - 1, -1 + yOffset, 0.0D);
        tessellator.addVertex(-stringMiddle - 1, 8 + yOffset, 0.0D);
        tessellator.addVertex(stringMiddle + 1, 8 + yOffset, 0.0D);
        tessellator.addVertex(stringMiddle + 1, -1 + yOffset, 0.0D);
        tessellator.draw();
        GL11.glEnable(3553);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
        fontRenderer.drawString(text, -fontRenderer.getStringWidth(text) / 2, yOffset, color);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
        fontRenderer.drawString(text, -fontRenderer.getStringWidth(text) / 2, yOffset, color);
        GL11.glEnable(2896);
        GL11.glDisable(3042);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glPopMatrix();
    }
}
