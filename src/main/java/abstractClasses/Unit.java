package abstractClasses;

import interfaces.NewInterface;
import workClasses.Location;


public abstract class Unit implements NewInterface {

    public Unit(String name, int x, int y, int damage, int health) {
        this.name = name;
        location = new Location(x, y);
        this.damage = damage;
        this.health = health;
    }

    int health;
    protected int damage;
    private Location location;
    protected String name;
    protected String state = "Stand";

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public String getInfo() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public int getX() {
        return location.getX();
    }

    public int getY() {
        return location.getY();
    }

//    public void move(int newX, int newY) {
//        this.location.setX(newX);
//        this.location.setY(newY);
//        System.out.println(name + " moved to (" + newX + ", " + newY + ").");
//    }

    public void die() {
        this.state = "dead";
        System.out.println(name + " has died.");
    }
}
