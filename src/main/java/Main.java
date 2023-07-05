import abstractClasses.Unit;
import workClasses.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Unit> team1 = new ArrayList<>();
//        for (int i = 0; i <4; i++) {
//            int value = new Random().nextInt(5);
//            switch (value){
//                case 0 -> team1.add(new Crossbowman("crossbowman",1,value+1));
//                case 1 -> team1.add(new Lanceman("lanceman",1,value+1));
//                case 2 -> team1.add(new Mage("mage",1,value+1));
//                case 3 -> team1.add(new Peasant("peasant",1,value+1));
//            }
//        }
//        ArrayList<Unit> team2 = new ArrayList<>();
//        for (int i = 0; i <4; i++) {
//            int value = new Random().nextInt(5);
//            switch (value){
//                case 0 -> team2.add(new Peasant("peasant",10,value+1));
//                case 1 -> team2.add(new Rogue("rouge",10,value+1));
//                case 2 -> team2.add(new Sniper("sniper",10,value+1));
//                case 3 -> team2.add(new Monk("monk",10,value+1));
//            }
//        }

        ArrayList<Unit> team1 = new ArrayList<>();
        team1.add(new Crossbowman("Crossbowman", 1, 2));
        team1.add(new Lanceman("Lanceman", 1, 4));
        team1.add(new Mage("Mage", 1, 6));
        team1.add(new Peasant("Peasant", 1, 8));


        ArrayList<Unit> team2 = new ArrayList<>();
        team2.add(new Peasant("PeasantTeam2", 7, 10));
        team2.add(new Rogue("Rogue", 7, 12));
        team2.add(new Sniper("Sniper", 7, 14));
        team2.add(new Monk("Monk", 7, 16));



        for (Unit unit : team1) {
            System.out.println(unit.getInfo());
        }
        System.out.println();
        for (Unit unit : team2) {
            System.out.println(unit.getInfo());
        }


        for (Unit unit : team1) {
                unit.step(team1, team2);
            }

            for (Unit unit : team2) {
                unit.step(team1, team2);
            }
        }

    }
