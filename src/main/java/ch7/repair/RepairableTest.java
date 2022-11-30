package ch7.repair;

import java.util.Vector;

public class RepairableTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(new Dropship());
        vector.add(new Tank());
        vector.add(new Marine());
        vector.add(new SCV());
        SCV scv = new SCV();

        scv.repair((Repairable) vector.get(0));
        scv.repair((Repairable) vector.get(1));
//        scv.repair(marine);
    }
}
