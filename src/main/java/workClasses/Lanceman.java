package workClasses;

import abstractClasses.Infantry;
import abstractClasses.Unit;

import java.util.ArrayList;

public class Lanceman extends Infantry {

    private Location currentLocation;

    public Lanceman(int heroWorth, int health, int speed, int agility, String name) {
        super(heroWorth, health, speed, agility, name);
    }

    public Lanceman(String name) {
        super(name);
    }

    public Lanceman(String name, int x, int y) {
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

        System.out.println("Closest enemy for Lanceman: " + closestEnemyName);
        System.out.println("Distance: " + minDistance);
    }
}