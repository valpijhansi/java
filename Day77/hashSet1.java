import java.util.*;

class hashSet1 {
    public static void main(String args[]) {
        Set<Car> set = new HashSet<>();
        Car c1 = new Car();
        c1.setName("Kio");
        c1.setMileage(20);

        Car c2 = new Car();
        c1.setName("Maruti Suziki");
        c1.setMileage(11);

        Car c3 = new Car();
        c1.setName("Rolls Royace");
        c1.setMileage(25);

        Iterator<Car> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        set.add(c1);
        set.add(c2);
        set.add(c3);

        class Car {
            private int Mileage;
            private String name;

            public int getMileage() {
                return Mileage;
            }

            public void setMileage(int Mileage) {
                this.Mileage = Mileage;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "Car{" +
                        "Mileage=" + Mileage +
                        ", name='" + name + '\'' +
                        '}';
            }

        }
    }
}