package com.galacticunion.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModCreativeModeTab {
    public static final ItemGroup GALACTIC_UNION_TAB_1 = new ItemGroup("gu_tab_1") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItemsGU.TEST.get());
        }
    };
}
