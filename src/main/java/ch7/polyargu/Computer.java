package ch7.polyargu;

class Computer extends Product{
    Computer(int price){
        super(price);
    }

    @Override
    public String toString(){
        return "Computer";
    }
}
