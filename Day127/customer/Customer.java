package customer;

import java.util.regex.Pattern;

public class Customer {
    private int custID;
    private String custName;
    private String custAddress;

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
    Customer(int id,String name,String address) {
       this.custID = id;
        this.custName = name;
        this.custAddress = address;
    }
    public boolean isvalidCustomerNamem(String employeeNo) {

        String str = "[A-Za-z]{3}-[0-9]{4}";

        if (Pattern.compile(str).matcher(employeeNo).matches())
            return true;
        return false;

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
