package ch7;

public class Card {
    //카드 무늬의 수
    static final int KIND_MAX = 4;
    //무늬별 카드 수
    static final int NUM_MAX = 13;

    static final int CLOVER = 0;
    static final int HEART = 1;
    static final int DIAMOND = 2;
    static final int SPACE = 3;

    int kind;
    int number;

    Card(){
        this(CLOVER,1);
    }

    Card(int kind,int number){
        this.kind = kind;
        this.number = number;
    }

    public String toString(){
        String[] kinds = {"CLOVER","HEART","DIAMOND","SPACE"};

        return "kind : "+kinds[this.kind]+" number : "+this.number;
    }
}
