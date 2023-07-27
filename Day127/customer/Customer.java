package customer;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Customer {
    Scanner scan = new Scanner(System.in);
    private int custID;
    private String custName;
    private String custAddress = "[0-9][A-Za-z/s]{2,10}";

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    Customer(){
        custID = getCustID();
        custName = isValidName();
        custAddress = isValidAddress();
    }
    Customer(int id,String name,String address) {

       this.custID = id;
        this.custName = name;
        this.custAddress = address;
    }

    private int getcustID(){
        return (int)(Math.random()*101);
    }
    private String isValidName() {
        String name;
        boolean res;
        String Name ="";
        scan.nextLine();
        do {
            System.out.print("Enter customer name: ");
            name = scan.nextLine();

            res = Pattern.matches("[a-zA-z][A-Za-z/s]{2,20}", name);
            if(res) {
                String str = name.toLowerCase();
                boolean flag=true;
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)>64&&str.charAt(i)<91)
                        Name += str.charAt(i);
                    else if(flag==true){
                        Name += (char)(str.charAt(i)-32);
                        flag=false;
                    }
                    else if(str.charAt(i)==' '){
                        Name +=(" ");
                        flag=true;
                    }
                    else{
                        Name += str.charAt(i);
                    }
                }
            }

            else {
                System.out.println("invalid name: ");//name min 3 max 20 chars
            }

        } while(!res);

        return Name;
    }

    private String isValidAddress() {
        try{
            System.out.println("Enter the Address of a Customer: ");
            String Address = scan.next();
            if(Pattern.compile(custAddress).pattern().matches(Address)){
                System.out.println(Address);
            }
            else {
                throw new Exception("Address is not valid ");
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return custAddress;
    }

    public void display(){
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "custID=" + custID +
                ", custName='" + custName + '\'' +
                ", custAddress='" + custAddress + '\'' +
                '}';
    }
}
