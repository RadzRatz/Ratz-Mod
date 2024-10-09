package net.radzratz.eternalitems.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalitems.EternalItems;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EternalItems.MOD_ID);

    public static final Supplier<CreativeModeTab> ETERNAL_ITEMS_TAB = CREATIVE_MODE_TAB.register("eternal_items_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.DEMONIC_HEART.get()))
                    .title(Component.translatable("creativetab.eternalitems.eternal_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.DEMONIC_HEART);
                        output.accept(Moditems.SOURCE_MANIFESTATION);
                        output.accept(Moditems.RATZ_HEAD);
                        output.accept(Moditems.ANTIMATTER_FUSE);
                        output.accept(Moditems.GREGTASTIC_ATOMIC_PHD);
                        output.accept(Moditems.CAPACITOR);
                        output.accept(Moditems.BLACK_HOLE);
                    }).build());

    public static final Supplier<CreativeModeTab> ETERNAL_INGOTS_TAB = CREATIVE_MODE_TAB.register("eternal_ingots_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.STEEL_INGOT.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_ingots"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.STEEL_INGOT);
                        output.accept(Moditems.GRAPHITE_INGOT);
                    }).build());

    public static final Supplier<CreativeModeTab> ETERNAL_GEARS_TAB = CREATIVE_MODE_TAB.register("eternal_gears_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.ULTIMATE_GEAR.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_gears"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.ULTIMATE_GEAR);
                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
