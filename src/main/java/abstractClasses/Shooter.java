package abstractClasses;
import interfaces.NewInterface;
import workClasses.Location;
import workClasses.Peasant;
import java.util.ArrayList;
public abstract class Shooter extends Unit implements NewInterface {
    public int numberOfArrows; // кол!во боееприпасов
    public Shooter(String name, int x, int y, int damage, int health, int numberOfArrows) {
        super(name, x, y, damage, health);
        this.numberOfArrows = numberOfArrows;
    }
    public void Shoot(ArrayList<Unit> team2) {
        double minDistance = Double.MAX_VALUE;
        Unit closestEnemy = null;
        for (Unit enemy : team2) {
            double distance = this.location.minDistance(enemy.getLocation());
            if (distance < minDistance) {
                minDistance = distance;
                closestEnemy = enemy;
            }
        }
        if (closestEnemy != null) {
            closestEnemy.takeDamage(this.damage);
            System.out.println("Crossbowman shot " + closestEnemy.getInfo() + " for " + damage + " damage.");
        }
    }
    public boolean isLivingPeasant(ArrayList<Unit> team2){
        for (Unit unit : team2) {
            if(unit instanceof Peasant && unit.getHealth()>0){
                return true;
            }
        }
        return false;
    }
    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        if (health <= 0) return;
        if (numberOfArrows == 0) return;


        double minDistance = Double.MAX_VALUE;
        String closestEnemyName = "";
        Unit closestEnemy = null;
        for (Unit enemy : team2) {
            double distance = this.location.minDistance(enemy.getLocation());
            if (distance < minDistance) {
                minDistance = distance;
                closestEnemyName = enemy.getInfo();
                closestEnemy = enemy;
            }
        }
        System.out.println("Closest enemy for Crossbowman: " + closestEnemyName);
        System.out.println("Distance: " + minDistance);

        if (closestEnemy != null) {
            Shoot(team2);
        }
        if (isLivingPeasant(team2)) return;
        numberOfArrows--;
    }
}
