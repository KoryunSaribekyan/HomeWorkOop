package abstractClasses;

public abstract class Infantry extends Unit {


    public Infantry(int heroWorth, int health, int speed, int agility, String name) {
        super(heroWorth, health, speed, agility, name);
    }
    public Infantry(String name){
        super(name);
    }
    public Infantry(String name, int x, int y){
        super(name,x,y);
    }

    public void toAttackFaceToFace() {

    }
}
