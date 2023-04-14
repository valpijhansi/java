class Abstract1 {
    public static void main(String arg[]) {
        //SBI s = new SBI();
        kotak k=new kotak();
        k.interestRate();
    }
}

abstract class RBI {
    void deposit() {
        System.out.println("money is deposited");
    }

    void withDraw() {
        System.out.println("Money is withdrawing");
    }

    abstract void interestRate();
}

class SBI extends RBI {
    void interestRate() {
        System.out.println("12 percent");
    }
}
class kotak extends SBI{
    void interestRate()
    {
        System.out.println("7 percent");
    }
}