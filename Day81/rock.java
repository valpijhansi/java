class rock {
    public static void main(String args[]) {
        dog d = new dog();
        dog d1 = new dog("rossy");
        dog d2 = new dog();
        dog d3 = new dog();
        dog d4 = new dog("shiroo");
        System.out.println(dog.count);
       

    }
}
class dog {
   static  int count;
    String name;
    public dog() {
        count++;

    }
    public dog(String name) {
        this.name = name;
        count++;
    }
    public static int getCount(){
        return count;
    }
    void bark() {
        System.out.println("bow bow!");
    }
}