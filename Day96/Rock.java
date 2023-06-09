
@VIP(rating = 11,star = "scorpio")
class Rock {

    String name;
    Rock(String name) {
        this.name = name;
    }
    Rock() {

    }
    void print() {
        System.out.print(name.toUpperCase());
    }
    void printLn() {
        System.out.print("*");
    }
}