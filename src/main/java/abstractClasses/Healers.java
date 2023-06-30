package abstractClasses;

public abstract class Healers extends Unit{

    public Healers(int heroWorth, int health, int speed, int agility, String name) {
        super(heroWorth, health, speed, agility, name);
    }
    public Healers(String name){
        super(name);
    }

    public void getHealthy(){

    }
}
