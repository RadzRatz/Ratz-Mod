package net.radzratz.eternalitems.util;

import net.neoforged.fml.ModList;

public class ModCompatibility {

    public static boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }

}