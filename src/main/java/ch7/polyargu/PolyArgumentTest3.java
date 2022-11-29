package ch7.polyargu;

public class PolyArgumentTest3 {
    public static void main(String[] args) throws Exception {
        Buyer buyer = new Buyer();
        Tv tv = new Tv(90);
        Computer computer = new Computer(80);
        Audio audio = new Audio(70);

        buyer.buy(tv);
        buyer.buy(computer);
        buyer.buy(audio);
        buyer.summary();
        System.out.println();
        buyer.refund(tv);
        buyer.summary();
    }
}
