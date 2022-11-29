package ch7.polyargu;

class Product {
    int price, bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0); // 보너스는 물건 가격의 10%
    }

    Product(){
        price = 0;
        bonusPoint = 0;
    }
}
