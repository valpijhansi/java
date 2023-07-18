package TollGate;

public class tollGate {
    private int total_no_cars;
    private int total_amount;

    public int getTotal_no_cars() {
        return total_no_cars;
    }

    public void setTotal_no_cars(int total_no_cars) {
        this.total_no_cars = total_no_cars;
    }

    public int getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }
    tollGate(){
        total_no_cars = 0;
        total_amount = 0;
    }
    public void payingCar(){
        if(total_no_cars>0)
        setTotal_no_cars(4);
        total_no_cars++;
        int amount = 50;
        total_amount += amount;
    }
    public void noPayingCar(){
        total_no_cars++;
    }
    public void display(){
        System.out.println("total no of Cars: "+total_no_cars);
        System.out.println("Total amount collected:  "+total_amount);
    }

    @Override
    public String toString() {
        return "tollGate{" +
                "total_no_cars=" + total_no_cars +
                ", total_amount=" + total_amount +
                '}';
    }
}
