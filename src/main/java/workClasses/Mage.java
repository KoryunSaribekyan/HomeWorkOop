package workClasses;

import abstractClasses.Healers;

public class Mage extends Healers {

    public int mana;
    public int stockOfMana;

    public Mage(int heroWorth, int health, int speed, int agility, String name) {
        super(heroWorth, health, speed, agility, name);
    }
    public Mage(String name){
        super(name);
    }
}
