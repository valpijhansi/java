class SafeVarArgsAnnotation {
    public static void main(String args[]) {
        Maths<Integer> my = new Maths<>();
        Integer[] a = {1,2,3,4};
        my.Hello(a);

    }
}
class Maths<T> {
    @SafeVarargs
     final void Hello(T...arg) {
        for(T x : arg)
        System.out.println(x);
    }
}