package Libraray.Employees;

public class nonStaffing {
    String name;
    String Worktype;
    String Qualification;
    int salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWorktype() {
        return Worktype;
    }
    public void setWorktype(String worktype) {
        Worktype = worktype;
    }
    public String getQualification() {
        return Qualification;
    }
    public void setQualification(String qualification) {
        Qualification = qualification;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "nonStaffing [name=" + name + ", Worktype=" + Worktype + ", Qualification=" + Qualification + ", salary="
                + salary + "]";
    }
    
}
