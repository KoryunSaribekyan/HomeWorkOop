package workClasses;

import abstractClasses.Shooter;

public class Sniper extends Shooter {

    public Sniper(int heroWorth, int health, int speed, int agility, String name) {
        super(heroWorth, health, speed, agility, name);
    }
    public Sniper(String name){
        super(name);
    }
}
