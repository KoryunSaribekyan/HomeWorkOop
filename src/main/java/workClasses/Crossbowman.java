package workClasses;

import abstractClasses.Shooter;

public class Crossbowman extends Shooter {


    public Crossbowman(int heroWorth, int health, int speed, int agility, String name, int rangeOfFire, String arms, int remainingAmmunition) {
        super(heroWorth, health, speed, agility, name, rangeOfFire, arms, remainingAmmunition);
    }
    public Crossbowman(String name){
        super(name);
    }
}
