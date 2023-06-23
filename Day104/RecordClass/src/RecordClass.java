
import java.util.Objects;
class RecordClassEX {
    public static void main(String[] args) {
        person p1 = new person("Jhansi",21);
        //p1 = new person("Lokesh",23);
        person p2  = new person("Jhansi",21);
        //person p3 = new person(); it is not able to create default constructor
        System.out.println(p1);
        System.out.println(p1.getAge());
        System.out.println(p1.equals(p2));

    }
}
class person {
    private  String name;
    private int age;

    public int getAge() {
        return age;
    }



    public String getName() {
        return name;
    }
    person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }




}
