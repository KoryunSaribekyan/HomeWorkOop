package workClasses;

import abstractClasses.Shooter;
import abstractClasses.Unit;

import java.util.ArrayList;

public class Crossbowman extends Shooter {


    private Location currentLocation;

    public Crossbowman(int heroWorth, int health, int speed, int agility, String name, int rangeOfFire, String arms, int remainingAmmunition) {
        super(heroWorth, health, speed, agility, name, rangeOfFire, arms, remainingAmmunition);
    }

    public Crossbowman(String name) {
        super(name);
    }

    public Crossbowman(String name, int x, int y) {
        super(name, x, y);
        this.location = new Location(x, y);
    }


    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        double minDistance = Double.MAX_VALUE;
        String closestEnemyName = "";
        Location currentLocation = this.location;

        for (Unit enemy : team2) {
            double distance = this.location.minDistance(enemy.getLocation());
            if (distance < minDistance) {
                minDistance = distance;
                closestEnemyName = enemy.getInfo();
            }
        }

        System.out.println("Closest enemy for Crossbowman: " + closestEnemyName);
        System.out.println("Distance: " + minDistance);
    }
}

