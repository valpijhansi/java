import java.util.Arrays;

class refernce {

    public static void main(String args[])

    {
        int a[] = { 1, 2, 4 };

        System.out.println(Arrays.toString(a));

        modify(a);
        System.out.println(Arrays.toString(a));

    }

    static void modify(int a1[]) {
        for (int i = 0; i < a1.length; i++) {
            a1[i] = a1[i] + 2;
            System.out.println(Arrays.toString(a1));
        }
    }
}
