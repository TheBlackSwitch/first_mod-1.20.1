package net.theblackswitch.first_mod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.theblackswitch.first_mod.FirstMod;
import net.theblackswitch.first_mod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MODID);

    public static RegistryObject<Block> POLISHED_AMETHYST_BLOCK = registerBlock("polished_amethyst_block",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.AMETHYST_BLOCK)
                        .lightLevel((p_220869_)->{
                            return 5;
                        })
            )
    );

    public static RegistryObject<Block> POLISHED_AMETHYST_TILES = registerBlock("polished_amethyst_tiles",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.STONE_BRICKS)
                        .sound(SoundType.AMETHYST)
                        .lightLevel((p_220869_)->{
                            return 6;
                        })
            )
    );




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> BLOCK = BLOCKS.register(name, block);
        registerBlockItem(name, BLOCK);
        return BLOCK;
    }

    private static <T extends Block> /* make the registry object only accept blocks*/ RegistryObject<Item> /*Make the method return an item*/ registerBlockItem(String name, RegistryObject<T> block) { //custom method wich registers the block's item
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
