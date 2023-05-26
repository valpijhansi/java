

class Duck1 {
    public static void main(String args[]) {
        weight<Integer> lucky = new weight<>(123);
        weight<Float> ramesh = new weight<>(23.65f);
        weight<Double> moon = new weight<>(15555765548877887777.3344);
        System.out.println(ramesh.getWeight());

    }
}
class Weight<E,X> { 
    E mass;
    X isFit;

Weight(E e,X x) {
    mass = e;
    isFit = x;
}
E getMass() {
    return this.mass;
}
X getFit() {
    return isFit;
}
}