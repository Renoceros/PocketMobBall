package com.pocketmobball.registry;

import com.pocketmobball.item.PomoballItem;
import com.pocketmobball.Pomoball;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item POMOBALL = register("pomoball",
        new PomoballItem(new Item.Settings().maxCount(16)));

    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Pomoball.MOD_ID, name), item);
    }

    public static void init() {
        // Load class to trigger static initializers if needed
    }
}
