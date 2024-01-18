package net.muffinz.world_of_whimsy.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageScalingType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Holder;
import net.minecraft.world.World;
import net.muffinz.world_of_whimsy.WhimsyWorld;
import net.muffinz.world_of_whimsy.damage_types.ButterflyPuncture;

public class ButterflyDartEntity extends PersistentProjectileEntity {

	private static LivingEntity user;

	private static final TrackedData<ItemStack> ITEM = DataTracker.registerData(ButterflyDartEntity.class, TrackedDataHandlerRegistry.ITEM_STACK);

	//          CONSTRUCTORS          //

	public ButterflyDartEntity(EntityType<? extends ButterflyDartEntity> entityType, World world) {
		super(entityType, world);
	}
    /*
	public ButterflyDartEntity(World world, double x, double y, double z, boolean isInfinite) {
		super(WhimsyWorld.BUTTERFLY_DART_ENTITY, x, y, z, world);
	}

	public ButterflyDartEntity(World world, LivingEntity user, boolean isInfinite) {
		super(WhimsyWorld.BUTTERFLY_DART_ENTITY, user, world);
	}*/


	//           FUNCTIONS           //

	@Override
	protected ItemStack asItemStack() {
		return this.getDataTracker().get(ITEM);
	}

	//DamageType BUTTERFLY_PUNCTURE = new Holder<DamageType>("", DamageScalingType.ALWAYS, 1.0f);
	/*
	@Override
	protected void onHit(LivingEntity target) {

		if(this.user != null) {
			target.damage(new DamageSource(new ButterflyPuncture(), this.user), 5.0f);
		} else {
			target.damage(new DamageSource(new ButterflyPuncture()), 5.0f);
		}


		super.onHit(target);
		Entity entity = this.getEffectCause();

		//target.addStatusEffect();

	}*/

	@Override
	public void setVelocity(double x, double y, double z, float speed, float divergence) {
		super.setVelocity(x, y, z, speed, divergence);
	}
}
