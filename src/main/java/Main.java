import abstractClasses.Unit;
import workClasses.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

//Проанализировать и описать персонажей:
//        Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
//        На базе описания персонажей описать простейшую иерархию классов.
//        В основной программе создать по одному экземпляру каждого класса.
public class Main {
    public static <Sting> void main(String[] args) {
        Crossbowman crossbowman = new Crossbowman(1,2,1,1,"crossbowman",5,"Arbalet",5);
        Lanceman lanceman = new Lanceman(1,1,1,1,"lanceman");
        Mage mage = new Mage(1,1,1,1,"mage");
        Monk monk = new Monk(1,1,1,1,"monk");
        Peasant peasant = new Peasant(1,2,1,1,"peasant");
        Rogue rogue = new Rogue(1,1,1,1,"rogue");
        Sniper sniper = new Sniper(1,1,1,1,"sniper");
        ArrayList<Unit> list = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            int value = new Random().nextInt(7);
            switch (value){
                case 0 -> list.add(new Crossbowman("crossbowman"));
                case 1 -> list.add(new Lanceman("lanceman"));
                case 2 -> list.add(new Mage("mage"));
                case 3 -> list.add(new Peasant("peasant"));
                case 4 -> list.add(new Rogue("rouge"));
                case 5 -> list.add(new Sniper("sniper"));
                case 6 -> list.add(new Monk("monk"));
            }
        }
        ArrayList<Unit> list2 = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            int value = new Random().nextInt(7);
            switch (value){
                case 0 -> list2.add(new Crossbowman("crossbowman"));
                case 1 -> list2.add(new Lanceman("lanceman"));
                case 2 -> list2.add(new Mage("mage"));
                case 3 -> list2.add(new Peasant("peasant"));
                case 4 -> list2.add(new Rogue("rouge"));
                case 5 -> list2.add(new Sniper("sniper"));
                case 6 -> list2.add(new Monk("monk"));
            }
        }
        for (Unit name: list) {
            System.out.println(name.getInfo());
        }
        for (Unit name: list2) {
            System.out.println(name.getInfo());
        }
    }
}