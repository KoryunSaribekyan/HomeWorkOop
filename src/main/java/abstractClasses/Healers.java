package abstractClasses;

import interfaces.NewInterface;

import java.util.ArrayList;

public abstract class Healers extends Unit implements NewInterface {

    public Healers(String name, int x, int y, int damage, int health) {
        super(name, x, y, damage, health);
    }

    public void heal(ArrayList<Unit> targets) {
        for (Unit unit : targets) {
            if (unit instanceof Shooter) {
                Shooter shooter = (Shooter) unit;
                if (shooter.getHealth() > 0) {
                    shooter.health += 3;
                    System.out.println(this.getInfo() + " healed " + shooter.getInfo() + " for 3 health.");
                    break;
                }
            }
            if (unit instanceof Infantry) {
                Infantry infantry = (Infantry) unit;
                if (infantry.getHealth() > 0) {
                    infantry.health += 3;
                    System.out.println(this.getInfo() + " healed " + infantry.getInfo() + " for 3 health.");
                    break;
                }
            }
        }
    }

    @Override
    public void step(ArrayList<Unit> friendlyTeam, ArrayList<Unit> enemyTeam) {
        if (this.state.equals("dead")) {
            return;
        }

        heal(friendlyTeam);

        if (this.health <= 0) {
            die();
        }
    }
}