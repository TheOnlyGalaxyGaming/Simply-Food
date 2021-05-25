
package net.mcreator.simplyfood.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.simplyfood.itemgroup.SimplyFoodItemGroup;
import net.mcreator.simplyfood.SimplyfoodModElements;

@SimplyfoodModElements.ModElement.Tag
public class BananaPeelItem extends SimplyfoodModElements.ModElement {
	@ObjectHolder("simplyfood:banana_peel")
	public static final Item block = null;
	public BananaPeelItem(SimplyfoodModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SimplyFoodItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("banana_peel");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
