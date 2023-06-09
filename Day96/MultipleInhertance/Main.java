package MultipleInhertance;
public class Main implements cow,Buffalo{

    public static void main(String[] args) {

        Main main = new Main();

        main.milk();
    }
    @Override
    public void milk() {

        cow.super.milk();
        
    }
}