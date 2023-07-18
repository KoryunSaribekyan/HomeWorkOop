package workClasses;

import abstractClasses.Unit;
import workClasses.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int turn = 0;
   public static ArrayList<Unit> team1 = new ArrayList<>();
   public static ArrayList<Unit> team2 = new ArrayList<>();
   public static ArrayList<Unit> allTeam = new ArrayList<>();
    public static void main(String[] args) {
        int teamSize = 10;
        for (int i = 1; i <= teamSize; i++) {
            switch (new Random().nextInt(1, 5)) {
                case 1:
                    team1.add(new Crossbowman("Crossbowman", 1, i, 3, 10, 2));
                    break;
                case 2:
                    team1.add(new Lanceman("Lanceman", 1, i, 3, 10));
                    break;
                case 3:
                    team1.add(new Mage("Mage", 1, i, 0, 10));
                    break;
                case 4:
                    team1.add(new Peasant("Peasant", 1, i, 0, 10));
                    break;
            }
        }
        for (int i = 1; i <= teamSize; i++) {
            switch (new Random().nextInt(1, 5)) {
                case 1:
                    team2.add(new PeasantTeam2("PeasantTeam2", 10, i, 0, 10));
                    break;
                case 2:
                    team2.add(new Rogue("Rogue", 10, i, 3, 10));
                    break;
                case 3:
                    team2.add(new Sniper("Sniper", 10, i, 3, 10, 1));
                    break;
                case 4:
                    team2.add(new Monk("Monk", 10, i, 0, 10));
                    break;
            }
        }
        allTeam.addAll(team1);
        allTeam.addAll(team2);

        for (Unit unit : team1) {
            System.out.println(unit.getInfo());
        }
        System.out.println();
        for (Unit unit : team2) {
            System.out.println(unit.getInfo());
        }

        int round = 1;
        Scanner scanner = new Scanner(System.in);

        while (!team1.isEmpty() && !team2.isEmpty()) {
            View.view();
            scanner.nextLine();
            System.out.println();
            System.out.println("Round " + round);
            System.out.println();

            for (Unit unit : team1) {
                unit.step(team1, team2);
            }

            for (Unit unit : team2) {
                unit.step(team2, team1);
            }

            ArrayList<Unit> deadUnits = new ArrayList<>();
            for (Unit unit : allTeam) {
                if (unit.getHealth() == 0) {
                    deadUnits.add(unit);
                }
            }

            for (Unit unit : deadUnits) {
                if (team1.contains(unit)) {
                    team1.remove(unit);
                } else {
                    team2.remove(unit);
                }
            }

            round++;
        }

        if (team1.isEmpty() && team2.isEmpty()) {
            System.out.println("It's a draw!");
        } else if (team1.isEmpty()) {
            System.out.println("Team 2 wins!");
        } else {
            System.out.println("Team 1 wins!");
        }
    }


}
