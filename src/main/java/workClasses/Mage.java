package workClasses;

import abstractClasses.Healers;
import abstractClasses.Unit;

import java.util.ArrayList;

public class Mage extends Healers {

    public int mana;
    public int stockOfMana;

    public Mage(String name, int x, int y, int damage, int health) {
        super(name, x, y, damage, health);
    }


    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        double minDistance = Double.MAX_VALUE;
        String closestEnemyName = "";

        for (Unit enemy : team2) {
            double distance = this.location.minDistance(enemy.getLocation());
            if (distance < minDistance) {
                minDistance = distance;
                closestEnemyName = enemy.getInfo();
            }
        }

        System.out.println("Closest enemy for Mage: " + closestEnemyName);
        System.out.println("Distance: " + minDistance);
    }

}


