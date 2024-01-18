package net.muffinz.world_of_whimsy.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.HorizontalConnectingBlock;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class GiantLilypad extends HorizontalConnectingBlock {

	public GiantLilypad(float radius1, float radius2, float boundingHeight1, float boundingHeight2, float collisionHeight, Settings settings) {
		super(radius1, radius2, boundingHeight1, boundingHeight2, collisionHeight, settings);
	}
}
