 class MultiplicationUsingGeneric {
    public static void main(String[] args) {
        

        Multiply m = new Multiply();

        System.out.println(m.multiply(10,20));

        System.out.println(m.multiply(11,65));

        System.out.println(m.multiply(2, 245));

        System.out.println(m.multiply(234.56, 434.33f)); 
    }
}
class Multiply {

  
    public <T extends Number> double multiply(T one, T two) {
        
        return one.doubleValue() * two.doubleValue();
    }
}
