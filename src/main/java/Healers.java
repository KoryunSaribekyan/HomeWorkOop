import java.util.ArrayList;

public abstract class Healers extends Unit {

    public int manaPoints;
    public int magicDamage;
    public int attackRange;
    public int actionPriority; //0 - help; 1 - attack

    public Healers(int x,int y, int initiative, int manaPoints, int magicDamage, int attackRange, int actionPriority) {
        super(x, y, 70, 70, 5, 1, initiative, true);

        this.manaPoints = manaPoints;
        this.magicDamage = magicDamage;
        this.attackRange = attackRange;
        this.actionPriority = actionPriority;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> allys) {
        Unit tmp = findClosestEnemy(enemy);
        if (!isAlive && tmp == null) return;
        if (isAlive && tmp != null) {
            if ((int) coordinates.countDistance(tmp.coordinates) <= attackRange) {
                if (manaPoints > 0) {
                    tmp.getDamage(damage);
                    manaPoints -= 1;
                    state = "Attack";
                } else {
                    manaPoints += 1;
                    state = "Busy";
                }
            } else {
                move(tmp.coordinates, allys);
                state = "Moving";
            }

        }
    }

}