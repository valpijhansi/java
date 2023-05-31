import java.util.Arrays;

public class Cat {
    private String name;
    private double speed;
    private House[] houses;
    void sound() {
        System.out.println("Meow Meow");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSpeed() {
        return speed;

    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void setName(House[] houses2) {
    }
    public void setHouses(House[] houses2) {
    }
    @Override
    public String toString() {
        return "Cat [name=" + name + ", speed=" + speed + ", houses=" + Arrays.toString(houses) + "]";
    }
}