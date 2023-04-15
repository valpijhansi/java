class AbstractMethod {
    public static void main(String args[]) {
        fruits f = new fruits();
        f.mango();

        plants p = new plants();
        p.color();

    }
}

abstract class Trees {

    abstract void mango();//when ever we declared a method as a abstract then that is known as abstract Method
}

class fruits extends Trees {
    public void mango() {
        System.out.println("This is king of fruits");
    }
}

class plants {     
    public void color() {  //when ever we are not declared a method as a abstract then that is known as concrete Method
        System.out.println("plants are in green color");
    }
}