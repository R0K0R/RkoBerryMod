package net.S_Rko.testmod.item;

import net.S_Rko.testmod.testmod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_RKONITE = registerItem("raw_rkonite", new Item(new FabricItemSettings().group(ModItemGroup.TESTMOD)));
    public static final Item RKONITE = registerItem("rkonite", new Item(new FabricItemSettings().group(ModItemGroup.TESTMOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(testmod.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        testmod.LOGGER.debug("Registering Mod Items for" + testmod.MOD_ID);
    }
}
