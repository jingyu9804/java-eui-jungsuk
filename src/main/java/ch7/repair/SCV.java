package ch7.repair;

public class SCV extends GrandUnit implements Repairable{
    SCV(){
       super(60);
       hitPoint=MAX_HP;
    }

    void repair(Repairable r){
        if (r instanceof Unit){
            Unit u = (Unit) r;
            while(u.hitPoint!=u.MAX_HP){
                u.hitPoint++;
            }
            System.out.println(u+"의 수리가 끝났습니다.");
        }
    }

    @Override
    public String toString() {
        return "SCV";
    }
}
