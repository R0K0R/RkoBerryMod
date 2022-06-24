package net.S_Rko.testmod.tool_material;

import net.S_Rko.testmod.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TanzaniteToolMaterial implements ToolMaterial {

    public static final RkoniteToolMaterial INSTANCE = new RkoniteToolMaterial();

    @Override
    public int getDurability() {
        return 1731;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.5F;
    }

    @Override
    public float getAttackDamage() {
        return 5;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 21;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.TANZANITE);
    }
}
