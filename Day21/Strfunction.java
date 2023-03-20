class Strfunction {
    public static void main(String args[]) {
        String s1 = "lucky";
        String s2 = "chotu";
        String s3 = "chotu";

        System.out.println(s1.concat(s2));// combining s1+s2
        System.out.println(s1.length());// it returns the size of String
        System.out.println(s1.compareTo(s2));// compare s1 with s2, s1==s2=0,s1>s2=returns negative value,s1<s2=positive
                                             // value
        System.out.println(s2.charAt(3));// it display a character with respect to index
        System.out.println(s1.equals(s2));// it checks wheather it is true or false
        System.out.println(s2.endsWith("y"));//
        System.out.println(s2.contentEquals(s3));
        

    }

}