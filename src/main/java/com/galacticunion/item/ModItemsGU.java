package com.galacticunion.item;

import com.gempire.util.ModItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.galacticunion.GalacticUnion;

public class ModItemsGU {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GalacticUnion.MOD_ID);

    public static final RegistryObject<Item> TEST = ITEMS.register("test",
            () -> new Item(new Item.Properties().maxStackSize(1).group(ModCreativeModeTab.GALACTIC_UNION_TAB_1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
