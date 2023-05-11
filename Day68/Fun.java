public class Fun {

    public static void main(String[] args) {

        String str = "jaanu";
        String str1 = "jaanu";
        String str2 = new String("jaanu"); // it stored in inside string pool so address is different.

        System.out.println(str == str1); // compare address of the strings and return boolean value.
        System.out.println(str.equals(str1)); // it checks whether conetent equal or not.
        System.out.println(str == str2);
        System.out.println(str.equals(str2));

    }
}