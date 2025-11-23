package com.main.alyssa.item;

import com.main.alyssa.item.custom.TooltipItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.*;
import net.neoforged.bus.api.IEventBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.main.alyssa.Alyssa.MODID;

public class ModItems {
    private static final Logger LOGGER = LoggerFactory.getLogger(ModItems.class);
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    // Create a Deferred Register to hold Items which will all be registered under the "alyssa" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "alyssa" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // My first item (Example: An AI chip module)
    public static final DeferredItem<Item> AI_CHIP = ITEMS.register(
            "ai_chip",
            registryName -> new TooltipItem(
                    new Item.Properties()
                            .setId(ResourceKey.create(Registries.ITEM, registryName)),
                    "ai_chip"
            )
    );

    public static final DeferredItem<Item> AI_CHIP_V2 = ITEMS.register(
            "ai_chip_v2",
            registryName -> new TooltipItem(
                    new Item.Properties()
                        .setId(ResourceKey.create(Registries.ITEM, registryName))
                    .stacksTo(1),
                    "ai_chip_v2"
            )
    );

    // Alyssa's Heart TODO: ADD Glint and NBT
    public static final DeferredItem<Item> HEART_CORE = ITEMS.register(
            "heart_core",
            registryName -> new TooltipItem(
                    new Item.Properties()
                        .setId(ResourceKey.create(Registries.ITEM, registryName))
                    .stacksTo(1)
                    .rarity(Rarity.RARE), // Alyssa's Heart is at least Rare
                    "heart_core"
            ));

    // Alyssa's Memory Crystal
    public static final DeferredItem<Item> MEMORY_CRYSTAL = ITEMS.register(
            "memory_crystal",
            registryName -> new TooltipItem(
                    new Item.Properties()
                        .setId(ResourceKey.create(Registries.ITEM, registryName))
                    .stacksTo(16)
                    .rarity(Rarity.UNCOMMON),
                    "memory_crystal"
            ));

    // Alyssa's Emotion Module
    public static final DeferredItem<Item> EMOTION_MODULE = ITEMS.register(
            "emotion_module",
            registryName -> new TooltipItem(
                    new Item.Properties()
                        .setId(ResourceKey.create(Registries.ITEM, registryName))
                    .stacksTo(1)
                    .rarity(Rarity.EPIC),
                    "emotion_module"
            ));

    // Alyssa's Partial Neural Core Fragment
    public static final DeferredItem<Item> NEURAL_CORE_FRAGMENT = ITEMS.register(
            "neural_core_fragment",
            registryName -> new TooltipItem(
                    new Item.Properties()
                        .setId(ResourceKey.create(Registries.ITEM, registryName))
                .stacksTo(64)
                .rarity(Rarity.COMMON),
                "neural_core_fragment"
            ));

    public static final DeferredItem<Item> LED_IRIS_CHIP = ITEMS.register(
            "led_iris_chip",
            registryName -> new TooltipItem(
                    new Item.Properties()
                        .setId(ResourceKey.create(Registries.ITEM, registryName))
                    .stacksTo(2)
                    .rarity(Rarity.UNCOMMON),
                    "led_iris_chip"
            ));

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
            .title(Component.translatable("Alyssa"))
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .icon(() -> new ItemStack(AI_CHIP.get()))
            .displayItems((parameters, output) -> {
                output.accept(AI_CHIP.get()); // Literally just duplicate the line and Set the new item, way simpler than I thought
                output.accept(AI_CHIP_V2.get());
                output.accept(HEART_CORE.get());
                output.accept(MEMORY_CRYSTAL.get());
                output.accept(EMOTION_MODULE.get());
                output.accept(NEURAL_CORE_FRAGMENT.get());
                output.accept(LED_IRIS_CHIP.get());
                output.accept(SILICON_BLOCK.get());
    }).build());

    // Call this method on main class constructor to register everything!
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
        BLOCKS.register(bus);
        CREATIVE_MODE_TABS.register(bus);
        LOGGER.info("MOD-ITEMS: BLOCKS AND ITEMS REGISTERED!");
    }
}
