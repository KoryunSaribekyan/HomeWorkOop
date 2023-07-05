package interfaces;

import abstractClasses.Unit;

import java.util.ArrayList;

public interface NewInterface {
    void step(ArrayList<Unit> team1, ArrayList<Unit> team2);
    String getInfo();
}
