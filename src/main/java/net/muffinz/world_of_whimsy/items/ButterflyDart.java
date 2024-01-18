package net.muffinz.world_of_whimsy.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.muffinz.world_of_whimsy.entities.ButterflyDartEntity;

public class ButterflyDart extends Item {

	public ButterflyDart(Settings settings) {
		super(settings);
	}

	public boolean checkInfinite(PlayerEntity player) {
		return false;
	}


	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		ItemStack itemStack = user.getStackInHand(hand);
		if (!world.isClient) {
			//ButterflyDartEntity butterflyDart = new ButterflyDartEntity(world, user, false);
			//butterflyDart.setVelocity(user.getX(), user.getY(), user.getZ(), 5.0f, 0.0f);

			//world.spawnEntity(butterflyDart);
		}


		return TypedActionResult.success(itemStack, world.isClient());
	}
}
