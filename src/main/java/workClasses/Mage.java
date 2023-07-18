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
    public void step(ArrayList<Unit> friendlyTeam, ArrayList<Unit> enemyTeam) {
        super.step(friendlyTeam, enemyTeam);
    }
}