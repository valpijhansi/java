public class OwnCompileTimeException {
    public static void main(String[] args) throws Exception {
         MinBalanceException m = new MinBalanceException("balance greter than 500");
        try {
               m.min_balance(400);
           }catch (Exception e){
               System.out.println(e);
           }

    }
}
class MinBalanceException extends Exception {
    int min_balance;
    public MinBalanceException(String msg) throws Exception {



        if(min_balance<500)
            throw new MinBalanceException("balance must greater than 500");
        else
            this.min_balance = min_balance;
    }


    public void min_balance(int min_balance) {
        System.out.println(min_balance);
    }
}
