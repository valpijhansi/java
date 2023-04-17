import java.util.*;

class StaticBlock {
    public static void main(String[] args) {
        SBlock sb = new SBlock();
        SBlock sb1 = new SBlock();
        SBlock sb2 = new SBlock();

        // System.out.println()

    }
}

class SBlock {
    static int i;
    int x;
    static { //it is static block whenever we create many objects but it will take first one only
        i = 3;
        System.out.println("static block");
    }

    SBlock() {//it is constructor it will print result how many objects we can create that many times gives the output.
        System.out.println("empty Constructor");
    }
}
//Note:whenever we have both static block & constructor default it will take static block only