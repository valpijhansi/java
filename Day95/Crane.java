class Crane {
    int x;
    int y;
    @Deprecated
    public void display() {
        System.out.println("Hello bujji");
    }
    private int z;
    @Override
    public String toString() {
        return "Crane [x=" + x + ", y=" + y + ", z=" + z + "]";
    }
    public int getZ() {
        return z;
    }
     public Crane() {
        System.out.println("hello papa");
    }
    public Crane(int a,int b){
        System.out.println(a+b);
    }
   
  
}
