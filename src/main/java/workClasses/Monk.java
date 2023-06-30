package workClasses;

import abstractClasses.Healers;

public class Monk extends Healers {

    public Monk(int heroWorth, int health, int speed, int agility, String name) {
        super(heroWorth, health, speed, agility, name);
    }
    public Monk(String name){
        super(name);
    }

    @Override
    public void step() {

    }
}
