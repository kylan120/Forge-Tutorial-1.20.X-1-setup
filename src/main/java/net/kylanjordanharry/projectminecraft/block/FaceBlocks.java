package net.kylanjordanharry.projectminecraft.block;

import net.kylanjordanharry.projectminecraft.project;
import net.kylanjordanharry.projectminecraft.item.ModItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;
import java.util.function.Supplier;

// Name: Kylan, Harry, and Jordan
//Description: This is the mod blocks class
//Date: 10/3/2023

public class FaceBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, project.MOD_ID);

    public static final RegistryObject<Block> KYLAN_BLOCK = registerBlock("kylan_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.SLIME_BLOCK)));
    public static final RegistryObject<Block> KYLAN_UBER = registerBlock("kylan_uber",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.SCULK_SENSOR)));
    public static final RegistryObject<Block> KYLAN_ORE = registerBlock("kylan_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).sound(SoundType.SLIME_BLOCK)));
    public static final RegistryObject<Block> JORDAN_BLOCK = registerBlock("jordan_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STEM)));
    public static final RegistryObject<Block> JORDAN_UBER = registerBlock("jordan_uber",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.SCULK_SENSOR)));
    public static final RegistryObject<Block> JORDAN_ORE = registerBlock("jordan_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).sound(SoundType.STEM)));
    public static final RegistryObject<Block> HARRY_BLOCK = registerBlock("harry_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.HONEY_BLOCK)));
    public static final RegistryObject<Block> HARRY_UBER = registerBlock("harry_uber",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.SCULK_SENSOR)));
    public static final RegistryObject<Block> HARRY_ORE = registerBlock("harry_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).sound(SoundType.SLIME_BLOCK)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
