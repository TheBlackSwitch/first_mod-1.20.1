package net.theblackswitch.first_mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.theblackswitch.first_mod.FirstMod;
import net.theblackswitch.first_mod.block.ModBlocks;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MODID);

public static final RegistryObject<CreativeModeTab> FIRST_MOD_ITEMS = CREATIVE_TABS.register("first_mod_items", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.POLISHED_AMETHYST.get()))
        .title(Component.translatable("creative_tab.first_mod_items"))
        .displayItems((pParameters, pOutput) -> {
            pOutput.accept(ModItems.SAND_PAPER.get());
            pOutput.accept(ModItems.POLISHED_AMETHYST.get());
            pOutput.accept(ModItems.POLISHED_AMETHYST_NUGGET.get());
        })
        .build());

public static final RegistryObject<CreativeModeTab> FIRST_MOD_BLOCKS = CREATIVE_TABS.register("first_mod_blocks", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.POLISHED_AMETHYST_TILES.get()))
        .title(Component.translatable("creative_tab.first_mod_blocks"))
        .displayItems((pParameters, pOutput) -> {
            pOutput.accept(ModBlocks.POLISHED_AMETHYST_BLOCK.get());
            pOutput.accept(ModBlocks.POLISHED_AMETHYST_TILES.get());
        })
        .build());

    public static void register(IEventBus bus) {
        CREATIVE_TABS.register(bus);
    }

}
