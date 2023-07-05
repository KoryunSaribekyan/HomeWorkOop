package workClasses;

//Создать класс с описанием координат, x и y.
//        Добавить в абстрактный класс поле с координатами и пробросить его инициализацию до конструкторов персонажей.
//        Farmer farmer = new Farmer(getName(), x, y);
public class Location  {
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x;
    public int y;

    public double minDistance(Location location) {
        double xDistance = Math.abs(this.x - location.x);
        double yDistance = Math.abs(this.y - location.y);
        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }

}
