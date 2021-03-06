package net.S_Rko.testmod.tool_material;

import net.S_Rko.testmod.item.ModItems;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RkoniteToolMaterial implements ToolMaterial {

    public static final RkoniteToolMaterial INSTANCE = new RkoniteToolMaterial();

    @Override
    public int getDurability() {
        return 999999;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 15.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 99;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.RKONITE);
    }
}
