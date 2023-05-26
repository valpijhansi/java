class Duck {
    public static void main(String args[]) {
        weight<Integer> lucky = new weight<>(123);
        weight<Float> ramesh = new weight<>(23.65f);
        weight<Double> moon = new weight<>(15555765548877887777.3344);
        System.out.println(ramesh.getWeight());

    }
}
class weight<E> {
    E marks;
    weight(E e) {
        marks = e;
    }
    E getWeight() {
        return this.marks;
    }
    public void addWeights(int i, float f) {
    }
}