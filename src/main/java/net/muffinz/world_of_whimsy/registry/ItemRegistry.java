package net.muffinz.world_of_whimsy.registry;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.muffinz.world_of_whimsy.items.ButterflyDart;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import static net.muffinz.world_of_whimsy.WhimsyWorld.MODID;

public class ItemRegistry {

	public static final Item BUTTERFLY_DART = new ButterflyDart(new QuiltItemSettings()
			.rarity(Rarity.RARE));


	public static void registerModItems() {
		Registry.register(Registries.ITEM, new Identifier(MODID, "butterfly_dart"), BUTTERFLY_DART);
	}
}
