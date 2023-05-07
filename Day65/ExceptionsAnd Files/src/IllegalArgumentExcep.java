public class IllegalArgumentExcep {
    int age;

    public void setAge(int age) throws Exception {
        int a[] = new int[3];
        int i = 5;
        if (i > 3)
            throw new IndexOutOfBoundsException();
        int c = a[i];
        if (age < 0)
            throw new IllegalArgumentException("age must greater than zero");
        else
            this.age = age;
    }

    public static void main(String[] args) {
        IllegalArgumentExcep Ip = new IllegalArgumentExcep();
        try {
            Ip.setAge(-1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();



        }

    }
}

