
class Main {
    public static void main(String args[]) {
        Nick n = new Duck(1,2);//when ever we call child class constructor first it will print parent class one along with child class constructor
        Duck d = new Duck(1);
        Duck d1 = new Duck(); 

    }
}
class Nick {
    Nick() {
        System.out.println("Default Parent");

    }
    Nick(int x) {
        System.out.println("one parent");
        
        

    }
    Nick(int x,int y) {
        System.out.println("Two Parent");

    }
}
class Duck extends Nick {
    Duck() {
        System.out.println("Default Child");

    }
    Duck(int x) {
        System.out.println("one child");
    }
    Duck(int x,int y) {
        System.out.println("Two Child");
    }
    
}