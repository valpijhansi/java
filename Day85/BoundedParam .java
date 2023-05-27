class BoundedParam {
    public static void main(String[] args) {

        getNum(45);
        getNum(456.45);
        getNum(1234.98f);
        getNum(93814294L);
        //getNum("jannu"); it doesn't accept the String values
        
        

       

    }

    public  static<T extends Number> void getNum(T num) {

        System.out.println("Number = "+num);
        
    }
}