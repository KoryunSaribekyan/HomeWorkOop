package workClasses;

import abstractClasses.Healers;
import abstractClasses.Infantry;
import abstractClasses.Shooter;
import abstractClasses.Unit;

import java.util.ArrayList;

public class Monk extends Healers {
    public Monk(String name, int x, int y, int damage, int health) {
        super(name, x, y, damage, health);
    }

    @Override
    public void step(ArrayList<Unit> friendlyTeam, ArrayList<Unit> enemyTeam) {
        super.step(friendlyTeam, enemyTeam);
    }
}