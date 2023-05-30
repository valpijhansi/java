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
}