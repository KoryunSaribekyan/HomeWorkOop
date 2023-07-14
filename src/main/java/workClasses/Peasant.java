package workClasses;
import abstractClasses.Unit;
import java.util.ArrayList;
public class Peasant extends Unit {
    public Peasant(String name, int x, int y, int damage, int health) {
        super(name, x, y, damage, health);
    }
    public void bringArrows(){ // принести стрелы
    }

    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        double minDistance = Double.MAX_VALUE;
        String closestEnemyName = "";

        for (Unit enemy : team2) {
            double distance = this.location.minDistance(enemy.location);
            if (distance < minDistance) {
                minDistance = distance;
                closestEnemyName = enemy.getInfo();
            }
        }

        System.out.println("Closest enemy for Peasant: " + closestEnemyName);
        System.out.println("Distance: " + minDistance);
    }

}

