package workClasses;

import abstractClasses.Infantry;

public class Lanceman extends Infantry {

    public Lanceman(int heroWorth, int health, int speed, int agility, String name) {
        super(heroWorth, health, speed, agility, name);
    }
    public Lanceman(String name){
        super(name);
    }
}
