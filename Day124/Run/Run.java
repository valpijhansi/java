package Run;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {

    static String longestRunner;
    static double longestDistance;
     private String name;
     private double Distance;

    public String getName() {
        return name;

    }

    public double getDistance() {
        return Distance;
    }

    public void setDistance(double distance) {
        Distance = distance;
        isValidDistance();
        if(this.Distance>longestDistance)
            longestDistance = this.Distance;
        longestRunner = this.name;
    }

    public void setName(String name) {

        this.name = name;
        isvalidName(name);

    }



    @Override
    public String toString() {
        return "Run{" +
                "name='" + name + '\'' +
                ", Distance=" + Distance +
                '}';
    }
   public void show() {
       System.out.println(this);
   }

    public void  isvalidName(String name){
        String str = "[A-Za-z]+";

        if(Pattern.compile(str).matcher(name).matches())
            System.out.println("It is valid name");
        else
            throw  new InputMismatchException("Enter valid name");



    }
    public void isValidDistance() {
        try {
            if (Distance < 0)
                System.out.println("Distance should not be negative");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static String getLongestRunner(){
        return longestRunner;
    }

}
