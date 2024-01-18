package net.muffinz.world_of_whimsy.registry;

import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.muffinz.world_of_whimsy.entities.ButterflyDartEntity;
import org.quiltmc.qsl.entity.api.QuiltEntityTypeBuilder;

import static net.muffinz.world_of_whimsy.WhimsyWorld.MODID;

public class EntityRegistry {

	public static final EntityType<ButterflyDartEntity> BUTTERFLY_DART_ENTITY = QuiltEntityTypeBuilder.<ButterflyDartEntity>create(SpawnGroup.MISC, ButterflyDartEntity::new)
			.setDimensions(EntityDimensions.changing(0.5f, 0.5f))
			.maxBlockTrackingRange(4)
			.trackingTickInterval(20)
			.build();

	public static void registerModEntities() {

		Registry.register(Registries.ENTITY_TYPE, new Identifier(MODID, "butterfly_dart"), BUTTERFLY_DART_ENTITY);

	}

}
