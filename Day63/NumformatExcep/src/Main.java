class NumFormatException {
    public static void main(String[] args) {
        int x =Integer.parseInt("123");
       int a = Integer.parseInt(null);//when ever we pass the mismatch value this shows an exception like NumFormat Exception
        System.out.println(x);
        System.out.println(a);//the value of expecting String but give null so that it shows an exception

    }

}