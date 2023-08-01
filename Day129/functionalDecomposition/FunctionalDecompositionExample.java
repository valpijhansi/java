package functionalDecomposition;

import java.util.Scanner;

public class FunctionalDecompositionExample {


    public void getMonthTitle(int year,int month){
        System.out.println(" "+getMonth(month)+" "+year);
        System.out.println("______________________________");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

    }
    public void printMonth(int year,int month){
        getMonthTitle(year,month);
    }
    public String getMonth(int month){
        String monthName = "";
        switch(month){
            case 1:
                monthName = "Jan";
                break;
            case 2:
                monthName = "Feb";
                break;
            case 3:
                monthName = "Mar";
                break;
            case 4:
                monthName = "Apr";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "Jun";
                break;
            case 7:
                monthName = "Jul";
                break;
            case 8:
                monthName = "Aug";
                break;
            case 9:
                monthName = "Sep";
                break;
            case 10:
                monthName = "Oct";
                break;
            case 11:
                monthName = "Nov";
                break;
            case 12:
                monthName = "Dec";
                break;
            default:
                System.out.println("Enter the valid month");



        }

        return monthName;
    }
    public void printMonthBody(int year,int month){
        int firstDay = getStartDay(year,month);
        int NoOfDaysInMonth = getNumberOfDaysInMonth(year,month);
        int i=0;
        for(i=0;i<=firstDay;i++){
            System.out.print("");
            for(i=1;i<=NoOfDaysInMonth;i++){
                System.out.print(i);
                if((i+firstDay)%7==0){
                    System.out.println();
                }
                System.out.println();
            }
        }
    }

    private int getNumberOfDaysInMonth(int year, int month) {
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
            return 31;
        if(month==4||month==6||month==9||month==12)
            return 30;
        if(month==2)

        return 29;

        return 0;
    }

    private boolean isleapYear(int year) {
        if(year%400==0||(year%4==0&&year%100!=0))
            return true;
        return  false;

    }

    private int getStartDay(int year, int month) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting day:");
        int startDay = sc.nextInt();
        switch (startDay){
            case 1:
                startDay = 1;
                break;
            case 2:
                startDay = 2;
                break;
            case 3:
                startDay = 3;
                break;
            case 4:
                startDay = 4;
                break;
            case 5:
                startDay = 5;
                break;
            case 6:
                startDay = 6;
                break;
            case 7:
                startDay = 7;
                break;

        }
        return startDay;
    }
    public void Print(int year,int month){
        printMonth(year,month);
        printMonthBody(year,month);
    }

    public static void main(String[] args) {
        FunctionalDecompositionExample fd = new FunctionalDecompositionExample();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year in between 2001 to 2023: ");
              int   year = sc.nextInt();
              System.out.println("Enter the month from 1 to 12: ");
              int  month = sc.nextInt();



           fd.Print(year,month);
        }


    }

