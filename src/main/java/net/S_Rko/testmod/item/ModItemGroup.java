package net.S_Rko.testmod.item;

import net.S_Rko.testmod.testmod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TESTMOD = FabricItemGroupBuilder.build(new Identifier(testmod.MOD_ID, "testmod"), () -> new ItemStack(ModItems.RKONITE));
}
