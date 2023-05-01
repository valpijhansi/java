import java.math.BigDecimal;

class bigDecimal {
    public static void main(String[] args) {
        BigDecimal d = new BigDecimal("0.04");
        BigDecimal d1 = new BigDecimal("0.06");
        System.out.println(d.add(d1));
        System.out.println(d1.subtract(d));
        System.out.println(d.multiply(d1));
        System.out.println(d.abs());
        System.out.println(d1.negate());
        System.out.println(d.pow(2));
        
    }

}