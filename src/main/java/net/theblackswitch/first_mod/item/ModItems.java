package net.theblackswitch.first_mod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.theblackswitch.first_mod.FirstMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MODID);

    public static final RegistryObject<Item> POLISHED_AMETHYST = ITEMS.register("polished_amethyst", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_AMETHYST_NUGGET = ITEMS.register("polished_amethyst_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAND_PAPER = ITEMS.register("sand_paper", () -> new Item(new Item.Properties().stacksTo(1).durability(10)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
