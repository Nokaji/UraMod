package com.mod.uramod.items.tools;

import com.mod.uramod.init.BlockMod;

import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

public class ItemUraHammer extends ItemPickaxe
{

	public ItemUraHammer(Item.ToolMaterial material) {
	    super(material);
	  }
	  
	  public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z, EntityLivingBase living) {
	    if (living instanceof EntityPlayer && !world.isRemote) {
	      int i;
	      int y1;
	      int x1;
	      switch (determineOrientation(world, x, y, z, living)) {
	        case 0:
	          for (i = -1; i < 2; i++) {
	            for (int z1 = -1; z1 < 2; z1++) {
	              if (world.getBlock(x + i, y, z + z1).getBlockHardness(world, i, y, z1) >= 0.0F) {
	                world.getBlock(x + i, y, z + z1).harvestBlock(world, (EntityPlayer)living, x + i, y, z + z1, world.getBlockMetadata(x + i, y, z + z1));
	                world.setBlockToAir(x + i, y, z + z1);
	              } 
	            } 
	          } 
	          break;
	        case 1:
	          for (y1 = -1; y1 < 2; y1++) {
	            for (int z1 = -1; z1 < 2; z1++) {
	              if (world.getBlock(x, y + y1, z + z1).getBlockHardness(world, x, y1, z1) >= 0.0F) {
	                world.getBlock(x, y + y1, z + z1).harvestBlock(world, (EntityPlayer)living, x, y + y1, z + z1, world.getBlockMetadata(x, y + y1, z + z1));
	                world.setBlockToAir(x, y + y1, z + z1);
	              } 
	            } 
	          } 
	          break;
	        case 2:
	          for (x1 = -1; x1 < 2; x1++) {
	            for (int j = -1; j < 2; j++) {
	              if (world.getBlock(x + x1, y + j, z).getBlockHardness(world, x1, j, z) >= 0.0F) {
	                world.getBlock(x + x1, y + j, z).harvestBlock(world, (EntityPlayer)living, x + x1, y + j, z, world.getBlockMetadata(x + x1, y + j, z));
	                world.setBlockToAir(x + x1, y + j, z);
	              } 
	            } 
	          } 
	          break;
	      } 
	    } 
	    return super.onBlockDestroyed(stack, world, block, x, y, z, living);
	  }
	  
	  public int determineOrientation(World world, int x, int y, int z, EntityLivingBase living) {
	    if (MathHelper.abs((float)living.posX - x) < 2.0F && MathHelper.abs((float)living.posZ - z) < 2.0F) {
	      double d0 = living.posY + 1.82D - living.yOffset;
	      if (d0 - y > 2.0D || y - d0 > 0.0D)
	        return 0; 
	    } 
	    float rotation = MathHelper.abs(living.rotationYaw);
	    return ((rotation > 45.0F && rotation < 135.0F) || (rotation > 225.0F && rotation < 315.0F)) ? 1 : 2;
	  }
}
