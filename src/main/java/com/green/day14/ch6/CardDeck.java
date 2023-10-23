package com.green.day14.ch6;

public class CardDeck {
    Card[] cards;
    public CardDeck() {
        cards = new Card[52];
        String[] patterns = {"Spade", "Heart", "Diamond", "Club"};
        int idx = 0;
        for (int i = 0; i < patterns.length; i++) {
                String pattern = patterns[i];
            for (int z = 1; z <= 13; z++) {
                String denomination = getNumberFromInt(z);
                cards[idx++] = new Card(pattern, denomination);
                // cards[idx++] = c; 이 내용을 바로 윗줄에 넣어도 된다.
            }
        }
    }

    Card getCard() {
        Card c = null;
        while (true) {
            int rIdx = (int)(Math.random() * cards.length);
            c = cards[rIdx];
            if (c != null) {
                cards[rIdx] = null;
                break;
            }
        }
        return c;
        }

//        for (int i = 0; i < cards.length; i++) {
//            int val = (int)((Math.random()*cards.length));
//            randumCard = cards[val];
//
//            if (cards[i] != randumCard) {
//                cards[i] = randumCard;
//            } else
//                return cards[val];
//        }
//        return null;
//    }

    void printAll() {
        for (Card c  : cards) {
            c.printMySelf();
        }

//        for(int i = 0; i < cards.length; i++){
//            Card c = cards[i];
//            c.printMySelf();
//        }

    }
    private String getNumberFromInt(int num) {
        switch (num) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return Integer.toString(num); // String.valueof(num);
    }
}
