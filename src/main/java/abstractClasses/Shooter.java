package abstractClasses;

import interfaces.NewInterface;
import workClasses.Peasant;

import java.util.ArrayList;

public abstract class Shooter extends Unit implements NewInterface {
    public int numberOfArrows; // количество боеприпасов

    public Shooter(String name, int x, int y, int damage, int health, int numberOfArrows) {
        super(name, x, y, damage, health);
        this.numberOfArrows = numberOfArrows;
    }

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

    public boolean hasLivingAndStandingPeasant(ArrayList<Unit> team) {
        for (Unit unit : team) {
            if (unit instanceof Peasant && unit.state.equals("Stand")) {
                return true;
            }
        }
        return false;
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
        System.out.println("Closest enemy for " + this.name + ": " + closestEnemyName);
        System.out.println("Distance: " + minDistance);

        if (closestEnemy != null) {
            shoot(enemyTeam);
        }

        if (hasLivingAndStandingPeasant(friendlyTeam)) {
            numberOfArrows++;
        }
        numberOfArrows--;
        System.out.println(this.name + " has " + numberOfArrows + " arrow(s) left.");

        if (this.getHealth() <= 0) {
            die();
        }
    }
}