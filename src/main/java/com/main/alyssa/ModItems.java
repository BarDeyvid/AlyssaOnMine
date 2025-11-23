package com.main.alyssa;

import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import org.slf4j.Logger;

import static com.main.alyssa.Alyssa.MODID;

public class ModItems {
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // Create a Deferred Register to hold Blocks which will all be registered under the "alyssa" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    // Create a Deferred Register to hold Items which will all be registered under the "alyssa" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "alyssa" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // My first item (Example: An AI chip module)
    public static final DeferredItem<Item> AI_CHIP = ITEMS.registerSimpleItem("ai_chip");

    // "Simple" block
    public static final DeferredBlock<Block> SILICON_BLOCK = BLOCKS.register(
            "silicon_block",
            registryName -> new Block(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .destroyTime(2.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.GRAVEL)
                    .lightLevel(state -> 7)
            ));

    // And its Item
    public static final DeferredItem<BlockItem> SILICON_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("silicon_block", SILICON_BLOCK); // Why's this so simple? Probably will break soon enough

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ALYSSA_TAB = CREATIVE_MODE_TABS.register("alyssa_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.alyssa"))
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .icon(() -> AI_CHIP.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(AI_CHIP.get()); // Literally just duplicate the line and Set the new item, way simpler than I thought
                output.accept(SILICON_BLOCK.get());
    }).build());

    // Call this method on main class constructor to register everything!
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
        BLOCKS.register(bus);
        CREATIVE_MODE_TABS.register(bus);
    }
}
