class test1 {
    public static void main(String args[]) {
        int age = 32;// it is a primitive data type
        System.out.println(age);// so that we can print directly without using objects;
        Age a = new Age(35);// it is a wrapper class it can Access with class object
        System.out.println(a.value);
    }
}

class Age {
    int value;

    Age(int value) {
        this.value = value;
    }
}