package projectUsingInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mango implements Fruit{
    Scanner sc = new Scanner(System.in);
    private double price;
    private int quantity;
    private String color;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Mango(){
        this.color = isValidColor();
        this.price = ValidPrice();
        this.quantity = ValidQuantity();
    }

    private String isValidColor() {
         String Color;
        while (true) {
            try {
                System.out.println("Enter the color: ");
                Color = sc.next();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Enter valid string: ");
                sc.next();
                Color = sc.next();
            }

        }
        return Color;
    }

    private double ValidPrice() {
        boolean res = false;
        double amount;

        do {
            System.out.println("Enter the amount of Mangoes: ");
            amount = sc.nextDouble();
            if(amount>0){
                res = true;
            }
            if(res);
            else{
                System.out.println("Please Enter the valid amount: ");
            }


        }while (!res);
        return amount;
    }
    private int ValidQuantity(){
        boolean value = false;
        int weight;
        do{
            System.out.println("Enter the weight of mangoes: ");
            weight = sc.nextInt();
            if(weight>0){
                value = true;
            }
            if(value);
            else{
                System.out.println("Enter valid weight: ");
            }

        }while(!value);
        return weight;
    }

    @Override
    public void cost() {


    }
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Mango{" +

                "price=" + price +
                ", quantity=" + quantity +
                ", color='" + color + '\'' +
                '}';
    }
}
