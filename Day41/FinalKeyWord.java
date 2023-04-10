//final is a keyword used in java.We can declare method or a class as final we cannot extend or access any other class
class FinalKeyword {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.Nature();// it can't access the method because that calss can be declared as final
        t.Run();

    }
}

final class wildAnimal1 {
    void Nature() {
        System.out.println("They are cruel ");
    }
}

class Tiger extends wildAnimal1 {// it cannot extends the wildAnimal1 because that calss can be declared as 
                                 // inal
    void Run() {
        System.out.println("It runs very fastly");
    }
}
