package abstractClasses;

import java.util.ArrayList;

public abstract class Infantry extends Unit {

    public Infantry(String name, int x, int y, int damage, int health) {
        super(name, x, y, damage, health);
    }

    public void attackFaceToFace(ArrayList<Unit> targets) {
        // Логика атаки вплотную
    }

    @Override
    public void step(ArrayList<Unit> friendlyTeam, ArrayList<Unit> enemyTeam) {
        if (this.state.equals("dead")) {
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

        if (minDistance <= 1.0) {
            attackFaceToFace(enemyTeam);
        }

        if (this.getHealth() <= 0) {
            die();
        }
    }
}