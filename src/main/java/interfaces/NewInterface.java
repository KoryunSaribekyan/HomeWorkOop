package interfaces;

import abstractClasses.Unit;

import java.util.ArrayList;

public interface NewInterface {
    void step(ArrayList<Unit> friendlyTeam, ArrayList<Unit> enemyTeam);
    String getInfo();
}