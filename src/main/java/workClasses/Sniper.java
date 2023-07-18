package workClasses;

import abstractClasses.Shooter;
import abstractClasses.Unit;

import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper(String name, int x, int y, int damage, int health, int numberOfArrows) {
        super(name, x, y, damage, health, numberOfArrows);
    }

    @Override
    public void step(ArrayList<Unit> friendlyTeam, ArrayList<Unit> enemyTeam) {
        if (this.state.equals("dead")) {
            return;
        }
        if (numberOfArrows == 0) {
            return;
        }
        double minDistance = Double.MAX_VALUE;
        String closestEnemyName = "";
        Unit closestEnemy = null;
        for (Unit enemy : enemyTeam) {
            double distance = this.getLocation().minDistance(enemy.getLocation());
            if (distance < minDistance) {
                minDistance = distance;
                closestEnemyName = enemy.getInfo();
                closestEnemy = enemy;
            }
        }
        System.out.println("Closest enemy for Sniper: " + closestEnemyName);
        System.out.println("Distance: " + minDistance);

        if (closestEnemy != null) {
            shoot(enemyTeam);
        }

        if (!hasLivingAndStandingPeasant(friendlyTeam)) {
            numberOfArrows--;
        }

        if (this.getHealth() <= 0) {
            die();
        }
    }

    @Override
    public void shoot(ArrayList<Unit> targets) {
        double minDistance = Double.MAX_VALUE;
        Unit closestEnemy = null;
        for (Unit enemy : targets) {
            double distance = this.getLocation().minDistance(enemy.getLocation());
            if (distance < minDistance) {
                minDistance = distance;
                closestEnemy = enemy;
            }
        }
        if (closestEnemy != null) {
            closestEnemy.takeDamage(this.damage);
            System.out.println(this.name + " shot " + closestEnemy.getInfo() + " for " + damage + " damage.");
        }
    }
}
