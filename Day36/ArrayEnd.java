//print the end of the Array
public class ArrayEnd {
    public static void main(String args[]) {
        int a[] = { 14, 1, 2, 5, 7, 8 };
        endArray(a, a.length - 1);
    }

    static void endArray(int a[], int endInd) {

        System.out.print(a[endInd] + " ");
        endArray(a, endInd - 1);
        return;
    }
}