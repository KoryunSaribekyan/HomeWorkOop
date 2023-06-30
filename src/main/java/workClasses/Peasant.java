package workClasses;

import abstractClasses.Unit;

public class Peasant extends Unit {

    public Peasant(int heroWorth, int health, int speed, int agility, String name) {
        super(heroWorth, health, speed, agility, name);
    }
    public Peasant(String name){
        super(name);
    }

    public void bringArrows(){ // принести стрелы

    }
    public void gatherResources() {}  // для сбора ресурсов


    @Override
    public void step() {

    }
}
