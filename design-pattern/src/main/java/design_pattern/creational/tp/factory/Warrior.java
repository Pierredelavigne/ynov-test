package main.java.design_pattern.creational.tp.factory;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 200, 50);
    }

    @Override
    public void useSpecialSkill() {
        System.out.println(name + " utilise Coup Puissant !");
    }
}
