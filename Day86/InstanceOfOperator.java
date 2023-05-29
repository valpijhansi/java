//The instanceOf operator in java is used to check whether an object is an instance of a particular class or not.

class InstanceOfOperator {
    public static void main(String args[]) {
        Animal animal= new Animal();
        boolean res = animal instanceof Animal;
        
        Dog d = new Dog();
        
        Animal d1 = new Dog();
        System.out.println(d1.y);
        
        if(d1 instanceof Dog) { 
         Dog d3 = new Dog();
        System.out.println(d1.y);
        }
        
        if(res) {
            System.out.println("it is  an animal");
        } 
        else {
            System.out.println("it is not an anuimal");
        }
        System.out.println(res);


    }
}
class Animal {
  int y = 100;
}
class Dog extends Animal {
     int y = 50;
}