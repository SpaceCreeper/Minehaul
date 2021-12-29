package com.defnotjy_.minehaul.block.custom;

import com.defnotjy_.minehaul.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;

public class RicePlantBlock extends CropBlock {
    public RicePlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.RICE_SEEDS.get();
    }
}
