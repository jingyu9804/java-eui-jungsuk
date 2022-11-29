package ch7.polyargu;

import java.util.Vector;

public class Buyer { //고객
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();

    void buy(Product p) throws Exception { //구매
        if(money < p.price){
            throw new Exception("잔액이 부족하여 물건을 살 수 없습니다.");
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p+" 제품을 구입하셨습니다.");
    }

    void refund(Product p) throws Exception { //환불
        if(item.remove(p)){
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p+" 제품을 반품하셨습니다.");
        }
        else{
            throw new Exception("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() throws Exception{ //구매정보 요약
        int sum = 0; // 구매 금액 합계
        String itemList = ""; // 구매 리스트

        if(item.isEmpty()){
            throw new Exception("구입하신 제품이 없습니다.");
        }

        for(int i=0;i<item.size();i++){
            Product p = (Product) item.get(i);
            sum += p.price;
            itemList += (i==0) ? ""+p : " , "+p;
        }
        System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
        System.out.println("구입하신 제품은"+itemList+"입니다.");
    }
}
