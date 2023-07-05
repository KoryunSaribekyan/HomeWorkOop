package workClasses;

import abstractClasses.Healers;
import abstractClasses.Unit;

import java.util.ArrayList;

public class Monk extends Healers {

    public Monk(int heroWorth, int health, int speed, int agility, String name) {
        super(heroWorth, health, speed, agility, name);
    }

    public Monk(String name) {
        super(name);
    }

    public Monk(String name, int x, int y) {
        super(name, x, y);
        location = new Location(x,y);
    }


    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        double minDistance = Double.MAX_VALUE;
        String closestEnemyName = "";
        Location currentLocation = this.location;

        for (Unit enemy : team1) {
            double distance = this.location.minDistance(enemy.getLocation());
            if (distance < minDistance) {
                minDistance = distance;
                closestEnemyName = enemy.getInfo();
            }
        }

        System.out.println("Closest enemy for Monk: " + closestEnemyName);
        System.out.println("Distance: " + minDistance);
    }
}