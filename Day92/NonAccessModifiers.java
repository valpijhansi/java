public class NonAccessModifiers { // public is access modifier .For every public class must have their own file name. 

    public static void main(String[] args) {

        Mock m = new Nock(); 
        System.out.println(m.x);
        
    }
    
}

abstract class Mock {

    int x = 17;
}
class Nock extends Mock {

}
final class Rock { // when ever we declare a class as final we cannot able to access any where,"Final" is one of the non-accessModifer

}
    