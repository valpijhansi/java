package AbstractClass;

import java.util.Scanner;

abstract class Fruit {
     double cost;
     int quantity;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    abstract void cost();
    Fruit(){

    }

    Fruit(double price,int qt){
        this.cost = price;
        this.quantity = qt;
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "cost=" + cost +
                ", quantity=" + quantity +
                '}';
    }
}
class Apple extends Fruit{
    Scanner sc = new Scanner(System.in);

    Apple(){
        this.cost = ValidPrice();
        this.quantity = ValidQuantity();
    }
    private double ValidPrice() {
        boolean res = false;
        double amount;

        do {
            System.out.println("Enter the amount of Apple: ");
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
            System.out.println("Enter the weight of Apple: ");
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
    void cost() {
        System.out.println("The cost of apple "+ quantity + " is " + cost);

    }
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "cost=" + cost +
                ", quantity=" + quantity +
                '}';
    }
}
class Mango extends Fruit{
Scanner sc = new Scanner(System.in);
    Mango(){
        this.cost = ValidPrice();
        this.quantity = ValidQuantity();

    }
    @Override
    void cost() {
        System.out.println("The cost of Mango is:"+cost);
    }

    @Override
    public String toString() {
        return "Mango{" +
                "cost=" + cost +
                ", quantity=" + quantity +
                '}';
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
    public void display(){
        System.out.println(this);
    }
}
