package com.green.day15.ch7;

class Card{
    static final int KIND_MAX = 4; // 카드 무늬의 수
    static final int NUM_MAX = 13; // 무니별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    public Card() {
        this(SPADE,1);
    }

    public Card(int kind, int number) {
        this.kind = kind;
        this.number = number;

    }


    @Override
    public String toString() {
//        return kind + ", " + number;

        return String.format("kind: %d, number: %d", kind, number);
    }


//    public Card(int aa, int bb) {
//        kind = aa;
//        number = bb;
//    }

}



class Deck{
    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];



    public Deck() {
        int idx = 0;
        for (int i = 1; i <= Card.KIND_MAX; i++) {
            for (int z = 1; z <= Card.NUM_MAX; z++) {
                cardArr[idx++] = new Card(i, z);
            }
        }

//        for (Card c : cardArr) {
//            System.out.println(c);
//        }

    }
        public Card pick (int a) {
            return this.cardArr[a];

//        Card c = cardArr[a];
//        return c;

//            System.out.println(cardArr[a]);
//            return null;
        }
    public Card pick () {
        int a = (int)(Math.random()* cardArr.length);
        return  pick(a); //CARD_NUM 들어가도됨
    }

    public void shuffle(){

        Card tmp;

        for (int i = 0; i < CARD_NUM; i++) {
            int num = (int)(Math.random()* cardArr.length);
            tmp = cardArr[i];  // tmp = pick(i);
            cardArr[i] = cardArr[num];
            cardArr[num] = tmp;

            System.out.println(cardArr[i]);
        }


    }
}


public class DackTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
//        Card c1 = deck.pick(10);
//        System.out.println(c1);
//        System.out.println("============");
//        Card c2 = deck.pick();
//        System.out.println(c2);
        deck.shuffle();

    }
}
