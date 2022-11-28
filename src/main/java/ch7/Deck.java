package ch7;

public class Deck {
    final int CARD_NUMBER = 52;
    Card cardArr[] = new Card[CARD_NUMBER];

    // Deck의 카드를 초기화한다.
    // Card 카드 무늬의 수 KIND_MAX=4, 무늬별 카드의 수 NUM_MAX = 13
    Deck(){
        int count = 0;
        for(int kindNum=0;kindNum<Card.KIND_MAX;kindNum++){
            for(int num=1;num<=Card.NUM_MAX;num++){
                cardArr[count++] = new Card(kindNum,num);
            }
        }
    }

    Card pick(int index){
        return cardArr[index];
    }

    Card pick(){
        int index = (int)(Math.random() * CARD_NUMBER);

        return pick(index);
    }

    void shuffle(){
        for(int i=0;i<CARD_NUMBER;i++){
            int random = (int)(Math.random() * CARD_NUMBER);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[random];
            cardArr[random] = temp;
        }
    }
}
