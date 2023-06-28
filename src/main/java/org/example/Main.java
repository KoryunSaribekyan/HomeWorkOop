package org.example;
//Проанализировать и описать персонажей:
//        Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
//        На базе описания персонажей описать простейшую иерархию классов.
//        В основной программе создать по одному экземпляру каждого класса.
public class Main {
    public static void main(String[] args) {
        Crossbowman crossbowman = new Crossbowman(1,1,1,1,"crossbowman");
        Lanceman lanceman = new Lanceman(1,1,1,1,"lanceman");
        Mage mage = new Mage(1,1,1,1,"mage");
        Monk monk = new Monk(1,1,1,1,"monk");
        Peasant peasant = new Peasant(1,2,1,1,"peasant");
        Rogue rogue = new Rogue(1,1,1,1,"rogue");
        Sniper sniper = new Sniper(1,1,1,1,"sniper");
    }
}