package com.green.day13.ch6;

import com.green.day12.ch6.Card;

public class CarTest2 {

    public static void main(String[] args) {

        Card card1 = new Card();
        // 52개의 배열카드
        Card[] cards = makeCards(card1.number,card1.kind);
        System.out.println(cards.length);

        System.out.println();

    }


    public static Card[] makeCards(String number, String kind) {
        // Spade, Heart, Diamond, Club
        // A, 2~10, J, Q, K
        Card[] cards = new Card[52];
        for (int i = 0; i < 4; i++) {
            kind = kind + 1;
            for (int j = 0; j < number.length(); j++) {
                number = number+1;
            }
        }

        return cards;
    }


}
