package workClasses;

import abstractClasses.Infantry;
import abstractClasses.Unit;

import java.util.ArrayList;

public class Lanceman extends Infantry {
    public Lanceman(String name, int x, int y, int damage, int health) {
        super(name, x, y, damage, health);
    }

    @Override
    public void step(ArrayList<Unit> friendlyTeam, ArrayList<Unit> enemyTeam) {
        if (this.state.equals("dead")) {
            return;
        }

        double minDistance = Double.MAX_VALUE;
        String closestEnemyName = "";
        Location currentLocation = this.getLocation();

        for (Unit enemy : enemyTeam) {
            double distance = this.getLocation().minDistance(enemy.getLocation());
            if (distance < minDistance) {
                minDistance = distance;
                closestEnemyName = enemy.getInfo();
            }
        }

        System.out.println("Closest enemy for Lanceman: " + closestEnemyName);
        System.out.println("Distance: " + minDistance);

        if (minDistance <= 1.0) {
            attackFaceToFace(enemyTeam);
        }

        if (this.getHealth() <= 0) {
            die();
        }
    }
}
