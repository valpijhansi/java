class Employees {
    String ename;
    String Edept;
    int salary;
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
   
    public String getEdept() {
        return Edept;
    }
    public void setEdept(String edept) {
        Edept = edept;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employees [ename=" + ename + ", Edept=" + Edept + ", salary=" + salary + "]";
    }
}