package com.company;

public class Main {

    public static void main(String[] args) {
	Warrior warrior = new Warrior();
	Magic magic = new Magic();
	Medic medic = new Medic();

	Hero[] heroes = new Hero[]{warrior, medic, magic};

	for (Hero value:heroes) {
	    value.applySuperAbility(value.superAbilityType);
    }


    }
}
