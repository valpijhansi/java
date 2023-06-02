class SingletonDesignPattern {
    public static void main(String args[]) {
        
        fun.getfun().doSomething();
        fun f = new fun();
        System.out.println(f.a);

    }
}
class fun {

    int a = 20+546;
    private static fun obj = new fun();
    fun() {

    }
    public static fun getfun() {
        return obj;
    }
    public void doSomething() {
        System.out.println("know something !");
    }
}