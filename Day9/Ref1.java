class Ref1 {
    public static void main(String args[]) {
        String str = "lokesh";
        String s1 = "lokesh";
        String s2 = new String("lokesh");

        System.out.println(str);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}