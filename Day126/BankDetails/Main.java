package BankDetails;

public class Main {
        public static void main(String[] args) {
            BankAccount account = new BankAccount();

            account.deposit();
            account.withdraw();
            account.setAccountDetails(123456,"Savings",20000);
            account.dispAccountDetails();

        }
    }


