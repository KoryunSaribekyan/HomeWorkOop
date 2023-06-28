package org.example;

public abstract class Shooter extends Unit {
    public Shooter(int heroWorth, int health, int speed, int agility, String name) {
        super(heroWorth, health, speed, agility, name);
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
