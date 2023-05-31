class Student {
    String name;
    String rollNo;
    String Dept;
    String branch;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRollNo() {

        return rollNo;
    }
    
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public String getDept() {
        return Dept;
    }
    public void setDept(String dept) {
        Dept = dept;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
   
    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + ", Dept=" + Dept + ", branch=" + branch + "]";
    }

}