package net.radzratz.eternalitems;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.fml.ModList;
import net.radzratz.eternalitems.block.ModBlocks;
import net.radzratz.eternalitems.item.ModCreativeModeTabs;
import net.radzratz.eternalitems.item.Moditems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(EternalItems.MOD_ID)
public class EternalItems
{
    public static final String MOD_ID = "eternalitems";
    private static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public EternalItems(IEventBus modEventBus, ModContainer modContainer)
    {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        Moditems.register(modEventBus);
        ModBlocks.register(modEventBus);

        if(ModList.get().isLoaded("mekanism")) {

        }
        if(ModList.get().isLoaded("appliedenergistics2")) {

        }
        if(ModList.get().isLoaded("occultism")) {

        }
        if(ModList.get().isLoaded("gtceu")) {

        }
        if(ModList.get().isLoaded("productivebees")) {

        }

            // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            //Items
            event.accept(Moditems.DEMONIC_HEART);
            event.accept(Moditems.SOURCE_MANIFESTATION);
            event.accept(Moditems.RATZ_HEAD);
            event.accept(Moditems.ANTIMATTER_FUSE);
            event.accept(Moditems.GREGTASTIC_ATOMIC_PHD);
            event.accept(Moditems.CAPACITOR);
            event.accept(Moditems.BLACK_HOLE);
            event.accept(Moditems.COMET_SHARD);
            event.accept(Moditems.FORGOTTEN_SEA_COIN);
            event.accept(Moditems.ETERNAL_VORTEX);
            event.accept(Moditems.MULTIPRESS);
            //Ingots
            event.accept(Moditems.ALUMINUM_INGOT);
            event.accept(Moditems.ETERNAL_DARK_INGOT);
            event.accept(Moditems.ETERNAL_LIGHT_INGOT);
            event.accept(Moditems.GRAPHITE_INGOT);
            event.accept(Moditems.LEAD_INGOT);
            event.accept(Moditems.STEEL_INGOT);
            event.accept(Moditems.OSMIUM_INGOT);
            event.accept(Moditems.URANIUM_INGOT);
            //Nuggets
            event.accept(Moditems.LEAD_NUGGET);
            event.accept(Moditems.OSMIUM_NUGGET);
            event.accept(Moditems.URANIUM_NUGGET);
            //Rods
            event.accept(Moditems.ROD_LEAD);
            event.accept(Moditems.ROD_OSMIUM);
            event.accept(Moditems.ROD_URANIUM);
            //Plates
            event.accept(Moditems.PLATE_LEAD);
            event.accept(Moditems.PLATE_OSMIUM);
            event.accept(Moditems.PLATE_URANIUM);
            //Gears
            event.accept(Moditems.ULTIMATE_GEAR);
            //Raw Ores
            event.accept(Moditems.RAW_ALUMINUM);
            event.accept(Moditems.RAW_LEAD);
            event.accept(Moditems.RAW_NICKEL);
            event.accept(Moditems.RAW_OSMIUM);
            event.accept(Moditems.RAW_PLATINUM);
            event.accept(Moditems.RAW_SILVER);
            event.accept(Moditems.RAW_TIN);
            event.accept(Moditems.RAW_URANIUM);
            //Ore Dust
            event.accept(Moditems.LEAD_DUST);
            event.accept(Moditems.OSMIUM_DUST);
            event.accept(Moditems.URANIUM_DUST);
        }

        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            //ORE BLOCKS
            event.accept(ModBlocks.LEAD_ORE_BLOCK);
            event.accept(ModBlocks.OSMIUM_ORE_BLOCK);
            event.accept(ModBlocks.URANIUM_ORE_BLOCK);
            //DEEPSLATE ORE BLOCKS
            event.accept(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK);
            event.accept(ModBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK);
            event.accept(ModBlocks.DEEPSLATE_URANIUM_ORE_BLOCK);
            //RAW ORE BLOCKS
            event.accept(ModBlocks.RAW_LEAD_BLOCK);
            event.accept(ModBlocks.RAW_OSMIUM_BLOCK);
            event.accept(ModBlocks.RAW_URANIUM_BLOCK);
        }
        //METAL BLOCKS
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.LEAD_BLOCK);
            event.accept(ModBlocks.OSMIUM_BLOCK);
            event.accept(ModBlocks.URANIUM_BLOCK);
        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
