class Scope {

    public static void main(String args[]) {

        {
            int x = 10;//if we have to print this value we can access that one within the given block or Scope
            
        }
        int x = 20;
        System.out.println(x);//this will print x value as 20 because it is a local variable.
    }

}