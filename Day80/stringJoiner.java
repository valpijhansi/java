import java.util.StringJoiner;
class stringJoiner {
    public static void main(String args[]) {
        String arr[] = {"chinnu","munnu","junnu","kinnu"};
        int rock[] = {1,2,3};
        StringJoiner sj = new StringJoiner("-");
        for(int i = 0;i<arr.length;i++)
        sj.add(arr[i]);
        System.out.println(sj);
    }
}