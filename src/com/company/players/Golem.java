package com.company.players;

public class Golem extends Hero {
    private int magUron;
    private int healthEveryoneHero;

    public Golem(int health, int damage, int magUron) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_HEAL_HERO);
        this.magUron = magUron;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        //heroes[].setHealth(heroes[6].getHealth() - magUron);
        healthEveryoneHero = magUron / (heroes.length - 1);
        for (int i = 0; i < heroes.length; i++) {
            if (!heroes[i].getAbility().equals(SuperAbility.SAVE_DAMAGE_AND_HEAL_HERO)) {
                heroes[i].setHealth(heroes[i].getHealth() + healthEveryoneHero);
            }else{
                heroes[i].setHealth(heroes[i].getHealth() - magUron);
            }
        }
        System.out.println("Golem принял на себя урон " + magUron + " И каждому персонажу начисляется: " + healthEveryoneHero);
    }

    public int getMagUron() {
        return magUron;
    }

    public void setMagUron(int magUron) {
        this.magUron = magUron;
    }

    public int getHealthEveryoneHero() {
        return healthEveryoneHero;
    }

    public void setHealthEveryoneHero(int healthEveryoneHero) {
        this.healthEveryoneHero = healthEveryoneHero;
    }
}
