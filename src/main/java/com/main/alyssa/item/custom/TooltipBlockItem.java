package com.main.alyssa.item.custom;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class TooltipBlockItem extends BlockItem {

    private final String tooltipKey;

    public TooltipBlockItem(Block block, Properties properties, String tooltipKey) {
        super(block, properties);
        this.tooltipKey = tooltipKey;
    }

    @Override
    public void appendHoverText(ItemStack stack,
                                TooltipContext context,
                                TooltipDisplay tooltipDisplay,
                                Consumer<Component> tooltipAdder,
                                TooltipFlag flag) {

        tooltipAdder.accept(Component.translatable("tooltip.alyssa." + tooltipKey));

        boolean shift = InputConstants.isKeyDown(Minecraft.getInstance().getWindow(), InputConstants.KEY_LSHIFT)
                || InputConstants.isKeyDown(Minecraft.getInstance().getWindow(), InputConstants.KEY_RSHIFT);

        if (shift) {
            tooltipAdder.accept(Component.translatable("tooltip.alyssa." + tooltipKey + ".desc"));
        } else {
            tooltipAdder.accept(Component.translatable("tooltip.alyssa." + tooltipKey + ".shift"));
        }
    }
}
