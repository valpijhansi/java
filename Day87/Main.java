import java.util.Arrays;

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
        
        Cat ct = new Cat();
        ct.setName("tom");
        ct.setSpeed(19.0);
        
        Object[] pets ={ct};
        h1.setPets(pets);
        
        House hs = new House();
        hs.setHeight(100.4);
        House hs1 = new House();
        hs1.setLength(34.7);

        House houses[] = {hs,hs1};
        //ct.setName(houses);
        h1.setHouses(houses);

        System.out.println(h1);


    }
}
class Human {
    String name;
    int age;
    Gender gender;
     private Car[] cars;
    private Object[] pets;
    private House[] houses;
    
    public String getName() {
        return name;
    }
   
  
    public void setGender(Gender female) {
        this.gender = gender;
    }


    // public void setCars(Car[] cars) {
    //}
    public void setName( String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(){
       this.gender = gender;
    }

    public  Object[] getPets() {
        return getPets();
    }
    public void setPets(Object[] pets) {
        this.pets = pets;
    }
    public void setCars(Car[] cars) {
        this.cars = cars;
    }
    public House[] getHouses() {
        return houses;
    }
    public void setHouses(House[] houses) {
        this.houses = houses;
    }
enum Gender {
    MALE,FEMALE;
}
@Override
public String toString() {
    return "Human [name=" + name + ", age=" + age + ", gender=" + gender + ", cars=" + Arrays.toString(cars) + ", pets="
            + Arrays.toString(pets) + "]";
}
}