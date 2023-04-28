class StaticVar {
    int age = 12;//whenever we declare a variable inside class & out side method is called static variable or class variable

    public static void main(String[] args) {
        StaticVar sv = new StaticVar();
        System.out.println(sv.age);
    }
}