public class Car {
    String brand;
    int mileage;
    boolean havingAC;
    double price;
    int SeatingCapacity;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public boolean isHavingAC() {
        return havingAC;
    }
    public void setHavingAc(boolean havingAC) {
        this.havingAC = havingAC;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getSeatingCapacity() {
        return SeatingCapacity;
    }
    public void setSeatingCapacity(int SeatingCapacity) {
        this.SeatingCapacity = SeatingCapacity;
    }
    public String toString() {
        return "Car{"+
                 "brand=" + brand + 
                 ", mileage=" + mileage +
                 ", havingAc=" + havingAC +
                 ", price=" + price +
                 ", SeatingCapacity=" + SeatingCapacity +
                 "}";
    }
}
    