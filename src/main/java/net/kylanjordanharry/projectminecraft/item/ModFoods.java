package net.kylanjordanharry.projectminecraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

// Name: Kylan, Harry, Jordan
// Date: 10/10/2023
// Description: This is the food items class, this will create the object for our food
public class ModFoods
{
    public static FoodProperties KYLANFOOD = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1), 1.0f)
            .build();

    public static FoodProperties JORDANFOOD = new FoodProperties.Builder()
            .alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1), 1.0f)
            .build();

    public static FoodProperties HARRYFOOD = new FoodProperties.Builder()
            .alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 200, 1), 1.0f)
            .build();

}
