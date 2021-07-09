package com.company;

import java.util.Random;

public class Boss {

    private String name;
    private int hp;
    private int damage;
    private int defence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void changeDefence(){
        Random random = new Random();
        int indexRandom = random.nextInt(20)+1;

        System.out.println(defence+indexRandom);
    }
}
