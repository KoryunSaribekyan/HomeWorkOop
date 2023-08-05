import java.util.ArrayList;

public class Crossbowman extends Shooter {


    public Crossbowman(int x, int y, int initiative) {
        super(x, y, initiative + 3, 5, 20, 0);
    }

    @Override
    public String getInfo() {
        return "Archer [" + coordinates.x + ", " + coordinates.y + "] arrows: " + ammoAmount + " HP: " + currentHealth + "/" + health + " " + state;
    }
}