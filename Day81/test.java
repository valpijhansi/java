class test {
    public static void main(String args[]) {
        //int x =12;//when ever we declare the one variable it is not able to declare same one inthe same class it shows an error
        {
            int x = 10;
            System.out.println(x);//it will be with in the block only
        }
        int x =30;// it wii not shows an erorr because the above declared x have scope
        System.out.println(x);
    }
    static void helloMan() {
        System.out.println("static hello man");
    }
}