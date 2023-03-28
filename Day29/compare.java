//Comparing that given two Strings equal or not

class compare {
    public static void main(String args[]) {
        String s1 = "thoughts";
        String s2 = "oughts"; 
        int k = s1.compareTo(s2);//s1=s2 return 0,s1>s2 return positive value viceversa
        System.out.println(k);
    }
}