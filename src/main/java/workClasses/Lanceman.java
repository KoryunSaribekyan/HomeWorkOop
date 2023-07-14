package workClasses;

import abstractClasses.Infantry;
import abstractClasses.Unit;

import java.util.ArrayList;

public class Lanceman extends Infantry {


    public Lanceman(String name, int x, int y, int damage, int health) {
        super(name, x, y, damage, health);
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