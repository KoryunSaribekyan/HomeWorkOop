package abstractClasses;

import interfaces.NewInterface;

public abstract class Healers extends Unit implements NewInterface {

    public Healers(int heroWorth, int health, int speed, int agility, String name) {
        super(heroWorth, health, speed, agility, name);
    }
    public Healers(String name){
        super(name);

    }
    public Healers(String name, int x, int y){
        super(name,x,y);
    }

    public void getHealthy(){

    }
}
