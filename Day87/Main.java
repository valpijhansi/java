public class Main {
    public static void main(String args[]) {
        Human h1 = new Human();
        h1.setName("jaanu");
        h1.setAge(21);
        //h1.setGender(Gender.FEMALE);
        

        Car c1 = new Car();
        c1.setBrand("TATA");
        c1.setMileage(19);
        c1.setSeatingCapacity(5);
        c1.setPrice(7_0000);
       
        Car c2 = new Car();
        c2.setBrand("Toyota");
        c2.setMileage(20);
        c2.setSeatingCapacity(4);
        c2.setPrice(9_0000);
        Car cars[] ={c1,c2};
        h1.setCars(cars);

        System.out.println(h1);


    }
}
class Human {
    String name;
    int age;
    Gender gender;
    Car[] cars;
    private Object[] pets;
    
    public String getName() {
        return name;
    }
    public void setCars(Car[] cars) {
    }
    public void setName( String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Gender setGender(Gender female){
       return this.gender = gender;
    }

    public  Object[] getPets() {
        return getPets();
    }
    public void setPets(Object[] pets) {
        this.pets = pets;
    }
enum Gender {
    MALE,FEMALE;
}
}