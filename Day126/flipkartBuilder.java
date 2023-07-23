public class flipkartBuilder {
    private double price;
    private String name;
    private int age;

    public flipkartBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public flipkartBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public flipkartBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public flipkart createFlipkart() {
        return new flipkart(price);
    }
}