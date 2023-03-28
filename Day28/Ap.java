import java.util.Arrays;

class AP {

    public static void main(String args[]) {
        int a[] = { 5, 3, 1, 9, 8 };
        Arrays.sort(a);
        int dif = a[0] - a[1];
        for (int i = 1; i < a.length - 1; i++) {
            if ((a[i] - a[i + 1]) != dif){
                System.out.print("Not in A.p");
            return;
            }

        }
        System.out.print("In AP");
    }
}