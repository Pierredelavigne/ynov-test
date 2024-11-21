package main.java.design_pattern.creational.tp.factory;

public class Archer extends Character {
    public Archer(String name) {
        super(name, 150, 40);
    }

    @Override
    public void useSpecialSkill() {
        System.out.println(name + " utilise Tir Précis !");
    }
}
