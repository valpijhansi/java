//Printing N numbers using recusive function
class Nnum {
    public static void main(String args[]) {
        int n = 20;
        num(n, 1);
    }

    static int num(int n, int start) {
        if (start > n)
            return start + 1;

        System.out.println(start + " ");
        return num(n, start + 1);
    }
}