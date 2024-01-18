package net.muffinz.world_of_whimsy.registry;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.muffinz.world_of_whimsy.blocks.GiantLilypad;
import net.muffinz.world_of_whimsy.blocks.Wallpaper;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import static net.muffinz.world_of_whimsy.WhimsyWorld.MODID;

public class BlockRegistry {

	public static final Block GIANT_LILYPAD = new GiantLilypad(2, 2, 1, 1, 1, QuiltBlockSettings.create().collidable(true).dynamicBounds(true));
	public static final Block WALLPAPER_FLOWER = new Wallpaper(QuiltBlockSettings.create().collidable(false)/*.drops()*/.solid(false));
	public static final Block WALLPAPER_INSIGNIA1 = new Wallpaper(QuiltBlockSettings.create().collidable(false)/*.drops()*/.solid(false));

	public static void registerModBlocks() {

		//                Normal Block Registry                //

		Registry.register(Registries.BLOCK, new Identifier(MODID, "giant_lilypad"), GIANT_LILYPAD);

		//Wallpapers
		Registry.register(Registries.BLOCK, new Identifier(MODID, "wallpaper_flower"), WALLPAPER_FLOWER);
		Registry.register(Registries.BLOCK, new Identifier(MODID, "wallpaper_insignia1"), WALLPAPER_INSIGNIA1);





		//                Block Item Registry                //
		Registry.register(Registries.ITEM, new Identifier(MODID, "giant_lilypad"), new BlockItem(GIANT_LILYPAD, new QuiltItemSettings().rarity(Rarity.UNCOMMON)));

		//Wallpapers
		Registry.register(Registries.ITEM, new Identifier(MODID, "wallpaper_flower"), new BlockItem(WALLPAPER_FLOWER, new QuiltItemSettings()));
		Registry.register(Registries.ITEM, new Identifier(MODID, "wallpaper_insignia1"), new BlockItem(WALLPAPER_INSIGNIA1, new QuiltItemSettings()));
	}


}
