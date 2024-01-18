package net.muffinz.world_of_whimsy;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.AirBlock;
import net.minecraft.block.Block;
import net.minecraft.client.particle.SpellParticle;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.texture.Sprite;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.random.RandomGenerator;
import net.muffinz.world_of_whimsy.blocks.GiantLilypad;
import net.muffinz.world_of_whimsy.effects.ButterflyToxin;
import net.muffinz.world_of_whimsy.entities.ButterflyDartEntity;
import net.muffinz.world_of_whimsy.items.ButterflyDart;
import net.muffinz.world_of_whimsy.registry.BlockRegistry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.entity.api.QuiltEntityTypeBuilder;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.quiltmc.qsl.registry.attachment.impl.Initializer.id;

public class WhimsyWorld implements ModInitializer {

	public static final String MODID = "world_of_whimsy";
	public static final Logger LOGGER = LoggerFactory.getLogger("A World of Whimsy");


	StatusEffect BUTTERFLY_TOXIN = new ButterflyToxin(StatusEffectType.HARMFUL, 5);

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Whimsy world init", mod.metadata().name());

		BlockRegistry.registerModBlocks();


		/*         STATUS EFFECTS            */

		Registry.register(Registries.STATUS_EFFECT, new Identifier(mod.metadata().id(), "butterfly_toxin"), BUTTERFLY_TOXIN);
	}
}
