package IPL.Players;

public class Player {
    String name;
    int age;
    country Country;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public country getCountry() {
        return Country;
    }
    @Override
    public String toString() {
        return "Player [name=" + name + ", age=" + age + ", Country=" + Country + "]";
    }
    public void setCountry(country NEWZLAND) {
        Country = NEWZLAND;
    }
    
}
