package main.java.design_pattern.creational.tp.factory;
package rpg;

public abstract class Character {
    protected String name;
    protected int healthPoints;
    protected int attackPoints;

    public Character(String name, int healthPoints, int attackPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackPoints = attackPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return healthPoints;
    }

    public int getAttack() {
        return attackPoints;
    }

    public abstract void useSpecialSkill();
}
