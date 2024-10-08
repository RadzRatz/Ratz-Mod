package net.radzratz.eternalitems.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalitems.EternalItems;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EternalItems.MOD_ID);

    public static final DeferredItem<Item> DEMONIC_HEART = ITEMS.register("demonic_heart",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SOURCE_MANIFESTATION = ITEMS.register("source_manifestation",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
