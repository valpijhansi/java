package Libraray.Employees;

public class Staffing {
    String ename;
    String qualification;
    String empType;
    int salary;
    String typeWork;
    
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getEmpType() {
        return empType;
    }
    public void setEmpType(String empType) {
        this.empType = empType;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getTypeWork() {
        return typeWork;
    }
    public void setTypeWork(String typeWork) {
        this.typeWork = typeWork;
    }
    @Override
    public String toString() {
        return "Staffing [ename=" + ename + ", qualification=" + qualification + ", empType=" + empType + ", salary="
                + salary + ", typeWork=" + typeWork + "]";
    }
    
}
