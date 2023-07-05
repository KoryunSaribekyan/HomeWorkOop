package workClasses;

import abstractClasses.Unit;

import java.util.ArrayList;

public class Peasant extends Unit {

    public Peasant(int heroWorth, int health, int speed, int agility, String name) {
        super(heroWorth, health, speed, agility, name);
    }
    public Peasant(String name){
        super(name);

    }
    public Peasant (String name,int x,int y){super(name, x, y);
        this.location = new Location(x, y);
    }

    public void bringArrows(){ // принести стрелы

    }
    public void gatherResources() {}  // для сбора ресурсов

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

