package workClasses;

import abstractClasses.Shooter;
import abstractClasses.Unit;

import java.util.ArrayList;

public class PeasantTeam2 extends Unit {
    public PeasantTeam2(String name, int x, int y, int damage, int health) {
        super(name, x, y, damage, health);
    }

    public void bringArrows(ArrayList<Unit> friendlyTeam) {
        for (Unit unit : friendlyTeam) {
            if (unit instanceof Shooter) {
                Shooter shooter = (Shooter) unit;
                if (shooter.getHealth() > 0) {
                    shooter.numberOfArrows++;
                    System.out.println(this.getInfo() + " brought arrows to " + shooter.getInfo());
                    break;
                }
            }
        }
    }

    @Override
    public void step(ArrayList<Unit> friendlyTeam, ArrayList<Unit> enemyTeam) {
        if (!state.equals("dead")) {
            return;
        }

        bringArrows(friendlyTeam);
    }
}
