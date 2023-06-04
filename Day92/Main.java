public class Main{
 
    public static void main(String[] args) {

       // Duck duck = new Duck(); here duck is a abstract class it is not able create instance for this one.
    }
    
}
// public class Nick { it is not able to  cannot create more than one class as public in same file

// }

class Nick { // the outer class can be default, the class converted to byte code when we compile the java file

}

//rivate class Duck { // the outer  class cannot be private and also not protected

//}
abstract class Duck { // the outer class can be abstract but we cannot create the object of this class, 
                      // the class converted to byte code when we compile the java file
 
}

final class Dog { // the outer calss can be fianl but this class cannot be super class of any other class
                  // the class converted to byte code when we compile the java file
}
