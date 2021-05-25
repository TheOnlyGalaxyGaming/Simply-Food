package net.mcreator.simplyfood.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.simplyfood.item.SimplyFoodsItem;
import net.mcreator.simplyfood.SimplyfoodModElements;
import net.mcreator.simplyfood.SimplyfoodMod;

import java.util.Map;

@SimplyfoodModElements.ModElement.Tag
public class GiveSFCommandExecutedProcedure extends SimplyfoodModElements.ModElement {
	public GiveSFCommandExecutedProcedure(SimplyfoodModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SimplyfoodMod.LOGGER.warn("Failed to load dependency entity for procedure GiveSFCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(SimplyFoodsItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
