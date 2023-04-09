package Animals;

import wildAnimals.Tiger;
import wildAnimals.*;
import wildAnimals.Insects.*;

public class test {
    public static void main(String[] args) {
        goat g1 = new goat();
        sheep s1 = new sheep();
        hen h = new hen();
        elephant e = new elephant();
        spider s = new spider();
        Tiger t1 = new Tiger();
        leapord l1 = new leapord();
        l1.NoOflegs(4);
        t1.NoOflegs(4);
        g1.legs(4);
        s.Speciality();
        h.NoOflegs(2);
        s1.legs(4);// It can Accessed because legs we can declare as default & it is in the same
                   // package with sub class.
        // t1.display(); it is in Same package but not accessed because legs can be
        // declared as private

    }

}
