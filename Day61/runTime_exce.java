class runTime_exce {
    public static void main(String args[]) {
        int a = 2 / 0;// hete it Syntactically correct but logically not then it will shows an error like ArithmeticExeception
        System.out.println(a);//the execution stops at here only
        
        System.out.println("jaanu papa");//this will also not print because above stmt shows an Erorr & execution stops there only

    }
}