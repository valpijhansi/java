class Interface1 {
    public static void main(String args[]) {
        syndicate s = new syndicate();
        s.loans();
        s.balance();
        s.liquidAssets();
    }
}

interface RBI1 {
    public void balance();
                                   //all methods in interface must be overriden by other class then only we able to call the methods
                                   //otherwise it will shows an error
    public void liquidAssets();
}

abstract class HDFC implements RBI1 {
    public void balance() {
        System.out.println("11 crore");
    }

    abstract public void loans();
}

class syndicate extends HDFC { //if this class also an abstract we can not able to create an object of class
    public void loans() {
        System.out.println("loans on gold is having high interest");
    }

    public void liquidAssets() {
        System.out.println("these can be converted");
    }
}