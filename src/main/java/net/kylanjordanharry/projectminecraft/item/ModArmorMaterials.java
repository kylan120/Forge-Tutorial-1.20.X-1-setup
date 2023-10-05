package net.kylanjordanharry.projectminecraft.item;

import net.kylanjordanharry.projectminecraft.project;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    JORDAN("jordan", 26, new int[]{ 5, 7, 5, 4 },
            25, SoundEvents.ARMOR_EQUIP_GOLD, 1f,
            0f, () -> Ingredient.of(ModItems.JORDAN.get())),
    KYLAN("kylan", 26, new int[]{ 5, 7, 5, 4 },
            25, SoundEvents.ARMOR_EQUIP_GOLD, 1f,
            0f, () -> Ingredient.of(ModItems.KYLAN.get())),
    HARRY("harry", 26, new int[]{ 5, 7, 5, 4 },
            25, SoundEvents.ARMOR_EQUIP_GOLD, 1f,
            0f, () -> Ingredient.of(ModItems.HARRY.get()));

    // variables for armor stats
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final Float toughness;
    private final Float knockbackResistance;
    private final Supplier<Ingredient> repairIngredients;

    private static final int[] BASE_DURABILITY = { 11, 15, 16, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue,
                      SoundEvent equipSound, Float toughness, Float knockbackResistance, Supplier<Ingredient> repairIngredients) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredients = repairIngredients;
    }


    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredients.get();
    }

    @Override
    public String getName() {
        return project.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
