package abstractClasses;
import interfaces.NewInterface;
import workClasses.Location;
import java.util.ArrayList;
public abstract class Unit implements NewInterface {

    public Unit(String name, int x, int y, int damage,int health){
        this.name = name;
        location = new Location(x,y);
        this.damage = damage;
        this.health = health;
    }

    public int health;
    public int damage;
    public Location location;
    String name;

    public int getHealth(){
        return this.health;
    }
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }
    @Override
    public String getInfo() {
        return this.name;
    }
    public Location getLocation() {
        return location;
    }
}

