package workClasses;

import abstractClasses.Unit;

import java.util.Collections;
import java.util.ArrayList;

public class View {
    private static int step = 1;
    private static final int[] l = {0};
    private static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("-b"))) + formatDiv("-c");
    private static final String midl10 = formatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("-e"))) + formatDiv("-f");
    private static final String bottom10 = formatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("-h"))) + formatDiv("-i");

    private static void tabSetter(int cnt, int max) {
        int dif = max - cnt + 2;
        if (dif > 0)
            System.out.printf("%" + dif + "s", ":\t");
        else
            System.out.print(":\t");
    }

    private static String formatDiv(String str) {
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }

    private static String getChar(int x, int y, ArrayList<Unit> allTeam, ArrayList<Unit> team1, ArrayList<Unit> team2) {
        String out = "| ";
        for (Unit unit : allTeam) {
            if (unit.getLocation().getX() == x && unit.getLocation().getY() == y) {
                if (unit.getHealth() == 0) {
                    out = "|" + (AnsiColors.ANSI_RED + unit.getInfo().charAt(0) + AnsiColors.ANSI_RESET);
                    break;
                }
                if (team1.contains(unit))
                    out = "|" + (AnsiColors.ANSI_GREEN + unit.getInfo().charAt(0) + AnsiColors.ANSI_RESET);
                if (team2.contains(unit))
                    out = "|" + (AnsiColors.ANSI_BLUE + unit.getInfo().charAt(0) + AnsiColors.ANSI_RESET);
                break;
            }
        }
        return out;
    }

    public static void view() {
        if (step == 1) {
            System.out.print(AnsiColors.ANSI_YELLOW + "First step" + AnsiColors.ANSI_RESET);
        } else {
            System.out.print(AnsiColors.ANSI_YELLOW + "Step " + step + AnsiColors.ANSI_RESET);
        }
        step++;
        int maxInfoLength = 0;
        for (Unit unit : Main.allTeam) {
            maxInfoLength = Math.max(maxInfoLength, unit.getInfo().length());
        }
        l[0] = maxInfoLength;

        System.out.print("_".repeat(l[0] * 2));
        System.out.println("");
        System.out.print(top10 + "    ");
        System.out.print(AnsiColors.ANSI_GREEN + ":\tGreen side" + AnsiColors.ANSI_RESET);
        System.out.print(" ".repeat(l[0] - 9));
        System.out.println(AnsiColors.ANSI_BLUE + "Blue side" + AnsiColors.ANSI_RESET);

        for (int i = 1; i < 11; i++) {
            System.out.print(getChar(1, i, Main.allTeam, Main.team1, Main.team2));
        }
        System.out.print("|    ");
        System.out.print(Main.team1.get(0).getInfo());
        tabSetter(Main.team1.get(0).getInfo().length(), l[0]);
        if (Main.team2.size() > 0) {
            System.out.println(Main.team2.get(0).getInfo());
        } else {
            System.out.println();
        }
        System.out.println(midl10);

        for (int i = 2; i <= Main.team1.size(); i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j, Main.allTeam, Main.team1, Main.team2));
            }
            System.out.print("|    ");
            System.out.print(Main.team1.get(i - 1).getInfo());
            tabSetter(Main.team1.get(i - 1).getInfo().length(), l[0]);
            if (i <= Main.team2.size()) {
                System.out.println(Main.team2.get(i - 1).getInfo());
            } else {
                System.out.println();
            }
            System.out.println(midl10);
        }

        if (Main.team2.size() > Main.team1.size()) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(Main.team1.size() + 1, j, Main.allTeam, Main.team1, Main.team2));
            }
            System.out.print("|    ");
            System.out.print(Main.team2.get(Main.team1.size()).getInfo());
            tabSetter(Main.team2.get(Main.team1.size()).getInfo().length(), l[0]);
            System.out.println();
            System.out.println(midl10);
        }

        for (int i = Main.team1.size() + 2; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j, Main.allTeam, Main.team1, Main.team2));
            }
            System.out.print("|    ");
            tabSetter(0, l[0]);
            if (i <= Main.team2.size()) {
                System.out.println(Main.team2.get(i - 1).getInfo());
            } else {
                System.out.println();
            }
            System.out.println(midl10);
        }

        System.out.print(bottom10);
    }

}
