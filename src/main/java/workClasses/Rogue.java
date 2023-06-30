package workClasses;

import abstractClasses.Infantry;

public class Rogue extends Infantry {

    public Rogue(int heroWorth, int health, int speed, int agility, String name) {
        super(heroWorth, health, speed, agility, name);
    }
    public Rogue(String name){
        super(name);
    }

    public void stealGun(){  // украсть оружие

    }
    public void stealthMode(){  //для перехода в режим скрытности.

    }
}
