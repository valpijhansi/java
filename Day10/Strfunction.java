class Strfunction {
    public static void main(String args[]) {
        String s1 = "lucky";
        String s2 = "chotu";
        String s3 = "chotu";

        System.out.println(s1.concat(s2));
        System.out.println(s1.length());
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.charAt(3));
        System.out.println(s1.equals(s2));
        System.out.println(s2.endsWith("y"));
        System.out.println(s2.contentEquals(s3));

    }

}