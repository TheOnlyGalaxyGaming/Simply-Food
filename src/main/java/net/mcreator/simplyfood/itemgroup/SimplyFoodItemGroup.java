
package net.mcreator.simplyfood.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.simplyfood.item.SimplyFoodsItem;
import net.mcreator.simplyfood.SimplyfoodModElements;

@SimplyfoodModElements.ModElement.Tag
public class SimplyFoodItemGroup extends SimplyfoodModElements.ModElement {
	public SimplyFoodItemGroup(SimplyfoodModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsimply_food") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SimplyFoodsItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
