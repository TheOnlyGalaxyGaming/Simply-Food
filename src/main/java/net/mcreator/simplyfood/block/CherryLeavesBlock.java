
package net.mcreator.simplyfood.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Block;

import net.mcreator.simplyfood.itemgroup.SimplyFoodItemGroup;
import net.mcreator.simplyfood.SimplyfoodModElements;

@SimplyfoodModElements.ModElement.Tag
public class CherryLeavesBlock extends SimplyfoodModElements.ModElement {
	@ObjectHolder("simplyfood:cherry_leaves")
	public static final Block block = null;
	public CherryLeavesBlock(SimplyfoodModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(SimplyFoodItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends LeavesBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(0.5f, 3f).setLightLevel(s -> 0)
					.harvestLevel(1).harvestTool(ToolType.HOE).setRequiresTool().notSolid());
			setRegistryName("cherry_leaves");
		}
	}
}
