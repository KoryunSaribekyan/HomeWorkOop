package abstractClasses;

import interfaces.NewInterface;

public abstract class Shooter extends Unit implements NewInterface {
    public Shooter(int heroWorth, int health, int speed, int agility, String name) {
        super(heroWorth, health, speed, agility, name);
    }
    public Shooter(String name){
        super(name);
    }
    public Shooter(String name, int x, int y){
        super(name,x,y);
    }
    public Shooter(int heroWorth, int health, int speed, int agility, String name, int rangeOfFire, String arms, int remainingAmmunition) {
        super(heroWorth, health, speed, agility, name);
        this.rangeOfFire = rangeOfFire;
        this.arms = arms;
        this.remainingAmmunition = remainingAmmunition;
    }

    public int rangeOfFire;
    public String arms;
    public int remainingAmmunition; // кол!во боееприпасов




    public void Shoot(){

    }

}
