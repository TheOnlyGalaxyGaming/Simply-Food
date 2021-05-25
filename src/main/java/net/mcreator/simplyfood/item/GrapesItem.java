
package net.mcreator.simplyfood.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.simplyfood.itemgroup.SimplyFoodItemGroup;
import net.mcreator.simplyfood.SimplyfoodModElements;

@SimplyfoodModElements.ModElement.Tag
public class GrapesItem extends SimplyfoodModElements.ModElement {
	@ObjectHolder("simplyfood:grapes")
	public static final Item block = null;
	public GrapesItem(SimplyfoodModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(SimplyFoodItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(3).saturation(0.3f).build()));
			setRegistryName("grapes");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
