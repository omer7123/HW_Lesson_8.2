package com.company.players;

import java.util.Random;

public class Thor extends Hero{
    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUN);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random ran2 = new Random();
        int koeff = ran2.nextInt(5);
        if(koeff == 1){
            for (int i = 0; i < heroes.length; i++) {
                heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage());
            }
            System.out.println("Тор оглушил босса");
        }
    }
}
