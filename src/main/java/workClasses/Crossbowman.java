package workClasses;
import abstractClasses.Shooter;
import abstractClasses.Unit;
import java.util.ArrayList;
public class Crossbowman extends Shooter {
    public Crossbowman(String name, int x, int y, int damage, int health, int numberOfArrows) {
        super(name, x, y, damage, health, numberOfArrows);
    }
    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        super.step(team1, team2);
    }
}
