package ch7.repair;

public class Marine extends GrandUnit{ // 기계화 유닛으로 수리 불가
    Marine(){
        super(100);
        hitPoint=MAX_HP;
    }

    @Override
    public String toString() {
        return "Marine";
    }
}
