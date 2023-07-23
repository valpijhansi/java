package StudentUingConstructor;



import java.util.Scanner;
import java.util.regex.Pattern;

public class Student {

    private static int rollNum;
    private String sName;
    private int mark1;
    private int mark2;
    private int mark3;
    private int totalMarks;

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getStudName() {
        return sName;
    }

    public void setStudName(String studName) {
        this.sName = studName;
        isValidName();
    }
    Student(int rollNum, String studName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.sName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.totalMarks = mark1 + mark2 + mark3;
    }


    public void setStudDetails(int rollNum, String sName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.sName = sName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }


    public void calculateTotal() {
        totalMarks = mark1 + mark2 + mark3;
    }


    public void displayStudDetails() {
        System.out.println(this);
    }

    static String isValidName() {
        Scanner sc = new Scanner(System.in);
        String name;
        boolean res;
        String name1 ="";
        sc.nextLine();
        do {
            System.out.print("Enter student name: ");
            name = sc.nextLine();

            res = Pattern.matches("[a-zA-z][A-Za-z/s]{2,20}", name);
            if(res) {
                String str = name.toLowerCase();
                boolean flag=true;
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)>64&&str.charAt(i)<91)
                        name1 += str.charAt(i);
                    else if(flag==true){
                        name1 += (char)(str.charAt(i)-32);
                        flag=false;
                    }
                    else if(str.charAt(i)==' '){
                        name1 +=(" ");
                        flag=true;
                    }
                    else{
                        name1 += str.charAt(i);
                    }
                }
            }

            else {
                System.out.println("invalid name: ");
            }

        } while(!res);

        return name1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", studName='" + sName + '\'' +
                ", mark1=" + mark1 +
                ", mark2=" + mark2 +
                ", mark3=" + mark3 +
                ", totalMarks=" + totalMarks +
                '}';
    }




}



