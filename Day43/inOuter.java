
class inOuter {
    public static void main(String[] args) {
        animal a = new animal();
        // System.out.println(d);
        a.dogObj();

    }
}

class animal {// outer class only in public or default
    int x;

    private class Dog {// inner class can allows all the access modifiers
        int y;
    }

    void dogObj() {
        Dog d = new Dog();
        d.y = 10;
        System.out.println(d.y);
    }

}