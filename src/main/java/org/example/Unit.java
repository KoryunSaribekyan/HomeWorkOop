package org.example;

public abstract class Unit{

    public Unit(int heroWorth, int health, int speed, int agility, String name) {
        HeroWorth = heroWorth;
        Health = health;
        this.speed = speed;
        this.agility = agility;
        this.name = name;
    }

    public int HeroWorth; // Ценность героя
    public int Health;
    public int speed;
    public int agility;
    String name;
    public void attack(){

    }
    public void defend(){

    }
    public void moveAround(){

    }
}

