package abstractClasses;

import interfaces.NewInterface;
import workClasses.Location;

import java.util.ArrayList;


public abstract class Unit implements NewInterface {



    public Unit(int heroWorth, int health, int speed, int agility, String name) {
        HeroWorth = heroWorth;
        Health = health;
        this.speed = speed;
        this.agility = agility;
        this.name = name;
    }

    public Unit (String name){
        this.name = name;
    }

    public int HeroWorth; // Ценность героя
    public int Health;
    public int speed;
    public int agility;
    public Location location;

    public Unit(String name, int x, int y){
        this.name = name;
        location = new Location(x,y);

    }

    String name;
    public void attack(){

    }
    public void defend(){

    }
    public void moveAround(){

    }

    @Override
    public String getInfo() {
        return this.name;
    }

    public Location getLocation() {
        return location;
    }


}

