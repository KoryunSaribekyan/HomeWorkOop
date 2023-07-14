package abstractClasses;

import interfaces.NewInterface;

public abstract class Healers extends Unit implements NewInterface {


    public Healers(String name, int x, int y, int damage, int health) {
        super(name, x, y, damage, health);
    }

    public void getHealthy(){

    }
}
