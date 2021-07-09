package com.company;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero("Неуязвимый" ,5000, 1000,"Super-power");
        System.out.println("Герой: " + hero.name + "\nЗдоровье: " + hero.hp + "\nУрон: " + hero.damage+ "\nСпособность: " + hero.skill+ "\n_______________________________________________\n");

        Boss boss = new Boss();
        boss.setName("Омни-мен");
        boss.setDamage(1000);
        boss.setHp(10000);
        boss.setDefence(100);



        System.out.println("Босс:" + boss.getName() + "\nЗдоровье: " +boss.getHp() +"\n Урон:" + boss.getDamage() +"\n Защита: " + boss.getDefence());
        System.out.print("Защита: " ); boss.changeDefence();
    }
}
