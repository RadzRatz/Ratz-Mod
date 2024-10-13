package net.radzratz.eternalitems.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalitems.EternalItems;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EternalItems.MOD_ID);

    //Items
    //Needs Occultism
    public static final DeferredItem<Item> DEMONIC_HEART = ITEMS.register("demonic_heart",
            ()-> new Item(new Item.Properties()));
    //Needs Ars Nouveau
    public static final DeferredItem<Item> SOURCE_MANIFESTATION = ITEMS.register("source_manifestation",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RATZ_HEAD = ITEMS.register("ratz_head",
            ()-> new Item(new Item.Properties()));
    //Needs Mekanism
    public static final DeferredItem<Item> ANTIMATTER_FUSE = ITEMS.register("antimatter_fuse",
            ()-> new Item(new Item.Properties()));
    //Needs GregTechCEU
    public static final DeferredItem<Item> GREGTASTIC_ATOMIC_PHD = ITEMS.register("gregtastic_atomic_phd",
            ()-> new Item(new Item.Properties()));
    //Need AE2
    public static final DeferredItem<Item> MULTIPRESS = ITEMS.register("multipress",
            ()-> new Item(new Item.Properties()));
    //
    public static final DeferredItem<Item> CAPACITOR = ITEMS.register("capacitor",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLACK_HOLE = ITEMS.register("black_hole",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COMET_SHARD = ITEMS.register("comet_shard",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FORGOTTEN_SEA_COIN = ITEMS.register("forgotten_sea_coin",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ETERNAL_VORTEX = ITEMS.register("eternal_vortex",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNDEAD_HAND = ITEMS.register("undead_hand",
            ()-> new Item(new Item.Properties()));

    //Ingots
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRAPHITE_INGOT = ITEMS.register("graphite_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ETERNAL_DARK_INGOT = ITEMS.register("eternal_dark_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ETERNAL_LIGHT_INGOT = ITEMS.register("eternal_light_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            ()-> new Item(new Item.Properties()));

    //Nuggets
    public static final DeferredItem<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget",
            ()-> new Item(new Item.Properties()));

    //Rods
    public static final DeferredItem<Item> ROD_LEAD = ITEMS.register("rod_lead",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_OSMIUM = ITEMS.register("rod_osmium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_URANIUM = ITEMS.register("rod_uranium",
            ()-> new Item(new Item.Properties()));

    //Plates
    public static final DeferredItem<Item> PLATE_LEAD = ITEMS.register("plate_lead",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_OSMIUM = ITEMS.register("plate_osmium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_URANIUM = ITEMS.register("plate_uranium",
            ()-> new Item(new Item.Properties()));

    //Gears
    public static final DeferredItem<Item> ULTIMATE_GEAR = ITEMS.register("ultimate_gear",
            ()-> new Item(new Item.Properties()));

    //Raw Ores
    public static final DeferredItem<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_OSMIUM = ITEMS.register("raw_osmium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LEAD = ITEMS.register("raw_lead",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SILVER = ITEMS.register("raw_silver",
            ()-> new Item(new Item.Properties()));

    //Ore Dust
    public static final DeferredItem<Item> LEAD_DUST = ITEMS.register("lead_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OSMIUM_DUST = ITEMS.register("osmium_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_DUST = ITEMS.register("uranium_dust",
            ()-> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
