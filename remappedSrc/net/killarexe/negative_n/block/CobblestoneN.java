package net.killarexe.negative_n.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.killarexe.negative_n.register.NegativeNBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContext;
import net.minecraft.sound.BlockSoundGroup;

import java.util.Collections;
import java.util.List;

public class CobblestoneN extends Block {

    public CobblestoneN() {
        super(FabricBlockSettings
                .of(Material.STONE)
                .strength(1.3f, 10)
                .breakByHand(false)
                .sounds(BlockSoundGroup.STONE)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES, 1));
    }

    @Override
    public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
        List<ItemStack> drop = super.getDroppedStacks(state, builder);
        if(!drop.isEmpty()){
            return drop;
        }
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
