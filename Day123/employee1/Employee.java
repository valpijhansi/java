package employee1;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Employee {

    Scanner sc = new Scanner(System.in);

    String EmployeeNum;
    float Compensation;

    public String getEmployeeNo() {

        return EmployeeNum;
    }

    public boolean isvalidEmployeeNum(String employeeNo) {

        String str = "[A-Za-z]{3}-[0-9]{4}";

        if (Pattern.compile(str).matcher(employeeNo).matches())
            return true;
        return false;

    }

    public boolean isValidCompensation(float Compensation) {
        try {
            if (Compensation < 0) {
                throw new InputMismatchException("Value not in negative");
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
            }



        return false;
    }

    public void setEmployeeNo(String employeeNo) {

        if(isvalidEmployeeNum(employeeNo))

            this.EmployeeNum= employeeNo;
        else

            throw new InputMismatchException("Enter a valid Employee Number ");

    }

    public float getCompensation() {

        return Compensation;
    }

    public void setCompensation(float compensation) {
           isValidCompensation(compensation);
        this.Compensation = compensation;

    }

    public void display() {

        System.out.println(this);
    }

    @Override
    public String toString() {

        return "Employee [employeeNo=" + EmployeeNum+ ", Compensation=" + Compensation + "]";
    }


}
