package net.S_Rko.testmod.block;

import net.S_Rko.testmod.item.ModItemGroup;
import net.S_Rko.testmod.item.ModItems;
import net.S_Rko.testmod.testmod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static Block RKONITE_BLOCK = registerBlock("rkonite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.TESTMOD);
    public static Block RKONITE_ORE = registerBlock("rkonite_ore",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TESTMOD);
    public static Block DEEPSLATE_RKONITE_ORE = registerBlock("deepslate_rkonite_ore",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TESTMOD);
    public static Block NETHERRACK_RKONITE_ORE = registerBlock("netherrack_rkonite_ore",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TESTMOD);
    public static Block ENDSTONE_RKONITE_ORE = registerBlock("endstone_rkonite_ore",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TESTMOD);

    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerblockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(testmod.MOD_ID, name), block);
    }


    private static Item registerblockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(testmod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void RegisterModBlocks() {
        testmod.LOGGER.debug("Registering Mod Blocks for" + testmod.MOD_ID);
    }
}
