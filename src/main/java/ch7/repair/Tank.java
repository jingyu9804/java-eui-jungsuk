package ch7.repair;

public class Tank extends GrandUnit implements Repairable{
    Tank(){
        super(150);
        hitPoint=MAX_HP;
    }

    @Override
    public String toString() {
        return "Tank";
    }
}
