
//finding no.of Numdigits and it's sum in given String 
class numDigit {
    public static void main(String args[]) {
        String str = "loki12171jaanu";
        int Ndigit = 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)

                sum += (str.charAt(i) - 48);
            Ndigit++;
        }
        System.out.println(sum);
        System.out.println(Ndigit);
    }
}