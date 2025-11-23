package com.main.alyssa.item.custom;

import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.blaze3d.platform.Window;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class TooltipItem extends Item {

    private final String tooltipKey;

    public TooltipItem(Properties properties, String tooltipKey) {
        super(properties);
        this.tooltipKey = tooltipKey;
    }

    @Override
    public void appendHoverText(ItemStack stack,
                                TooltipContext context,
                                TooltipDisplay tooltipDisplay,
                                Consumer<Component> tooltipAdder,
                                TooltipFlag flag) {

        // Tooltip base
        tooltipAdder.accept(Component.translatable("tooltip.alyssa." + tooltipKey));

        boolean shift = false;
        Minecraft mc = Minecraft.getInstance();
        Window window = mc.getWindow();
        shift = InputConstants.isKeyDown(window, InputConstants.KEY_LSHIFT)
                || InputConstants.isKeyDown(window, InputConstants.KEY_RSHIFT);

        // Tooltip avançado ou dica de SHIFT
        if (shift) {
            tooltipAdder.accept(Component.translatable("tooltip.alyssa." + tooltipKey + ".desc"));
        } else {
            tooltipAdder.accept(Component.translatable("tooltip.alyssa." + tooltipKey + ".shift"));
        }
    }
}
