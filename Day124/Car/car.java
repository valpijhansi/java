package Car;

import java.util.regex.Pattern;

public class car {
    private String name;
    private String direction;
    private static int position;

    public car(String name, String direction, int position) {
        this.name = name;
        this.direction = direction;
        this.position = position;
    }
    static boolean  isvalidName(String name){
        String str = "[A-Za-z]+";

        if(Pattern.compile(str).matcher(name).matches())
            return true;
        return false;


    }

    static boolean isValidPosition(){
        try {
            if (position < 0) {
                System.out.println("Position always in positive");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return true;
    }

    public void turn() {
        switch (this.direction) {
            case "E":
                this.direction = "S";
                break;
            case "S":
                this.direction = "W";
                break;
            case "W":
                this.direction = "N";
                break;
            case "N":
                this.direction = "E";
                break;
        }
    }

    public void turn(String newDirection) {
        this.direction = newDirection;
    }

    public void move(int distance) {
        this.position += distance;
    }

    public void show() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "car{" +
                "name='" + name + '\'' +
                ", direction='" + direction + '\'' +
                ", position=" + position +
                '}';
    }
}