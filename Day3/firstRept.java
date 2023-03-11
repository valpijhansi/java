import java.util.Arrays;

class firstRept {

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 5, 6, 5, 3, 2 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == a[i]){
                    System.out.print(a[j]);
                return;
                }
            }
        }
    }
}