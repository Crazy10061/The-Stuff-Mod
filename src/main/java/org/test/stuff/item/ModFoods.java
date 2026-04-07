package org.test.stuff.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.FoodData;
public class ModFoods {
    public static final FoodProperties HOT = new FoodProperties.Builder().nutrition(2)
            .nutrition(4) // You'll need to specify nutrition (hunger bars) here as well
            .saturationModifier(0.5f)
            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 250), 0.5f)
            .build();

    public static final FoodProperties CHOC = new FoodProperties.Builder().nutrition(1)
            .saturationModifier(0.5f)
            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 250), 0.5f)
            .build();
    public static final FoodProperties COLA = new FoodProperties.Builder().nutrition(2)
            .saturationModifier(1f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 250), 0.2f)
            .build();
}

