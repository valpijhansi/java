class studentResults {
    String sname;
    int  sid;
    String result;
    public String getSname() {
        return sname;
    }
   
    public void setSname(String sname) {
        this.sname = sname;
    }
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    @Override
    public String toString() {
        return "studentResults [sname=" + sname + ", sid=" + sid + ", result=" + result + "]";
    }
}