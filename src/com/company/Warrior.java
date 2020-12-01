package com.company;

public class Warrior extends Hero {
    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        System.out.println("Warrior used Critical damage!");
    }
}
