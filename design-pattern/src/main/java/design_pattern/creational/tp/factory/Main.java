package main.java.design_pattern.creational.tp.factory;

public class Main {
    public static void main(String[] args) {
        Character warrior = CharacterFactory.createCharacter("warrior", "Tharok");
        Character mage = CharacterFactory.createCharacter("mage", "Merlin");
        Character archer = CharacterFactory.createCharacter("archer", "Robin");

        System.out.println(warrior.getName() + " a " + warrior.getHealth() + " points de vie.");
        warrior.useSpecialSkill();

        System.out.println(mage.getName() + " a " + mage.getHealth() + " points de vie.");
        mage.useSpecialSkill();

        System.out.println(archer.getName() + " a " + archer.getHealth() + " points de vie.");
        archer.useSpecialSkill();
    }
}
