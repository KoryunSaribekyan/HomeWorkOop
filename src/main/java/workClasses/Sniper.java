package workClasses;

import abstractClasses.Shooter;
import abstractClasses.Unit;

import java.util.ArrayList;

public class Sniper extends Shooter {


    public Sniper(String name, int x, int y, int damage, int health, int numberOfArrows) {
        super(name, x, y, damage, health, numberOfArrows);
    }

    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        if (health <= 0) return;
        if (numberOfArrows == 0) return;
        double minDistance = Double.MAX_VALUE;
        String closestEnemyName = "";
        Unit closestEnemy = null;
        for (Unit enemy : team1) {
            double distance = this.location.minDistance(enemy.getLocation());
            if (distance < minDistance) {
                minDistance = distance;
                closestEnemyName = enemy.getInfo();
                closestEnemy = enemy;
            }
        }
        System.out.println("Closest enemy for Sniper: " + closestEnemyName);
        System.out.println("Distance: " + minDistance);

        if (closestEnemy != null) {
            Shoot(team1);
        }
        if (isLivingPeasant(team2)) return;
        numberOfArrows--;
    }

    @Override
    public void Shoot(ArrayList<Unit> team2) {
        double minDistance = Double.MAX_VALUE;
        Unit closestEnemy = null;
        for (Unit enemy : team2) {
            double distance = this.location.minDistance(enemy.getLocation());
            if (distance < minDistance) {
                minDistance = distance;
                closestEnemy = enemy;
            }
        }
        if (closestEnemy != null) {
            closestEnemy.takeDamage(this.damage);
            System.out.println("Sniper shot " + closestEnemy.getInfo() + " for " + damage + " damage.");
        }
    }
}