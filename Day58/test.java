class test {
    public static void main(String args[]) {
        float x = 6.43f;
        Float f = new Float(15.8f);
        float marks[] = { 12.3f, 13.4f, 14.5f };
        float res = Float.add(marks);
        System.out.println(res);
    }
}

class Float {
    float value;

    Float(float value) {
        this.value = value;
    }

    static float add(float[] arr) {
        float sum = 0;
        for (float i : arr)
            sum += i;
        return sum;
    }
}