package com.green.day13.ch6;

import com.green.day12.ch6.Card;

public class CarTest2_T1 {

    public static void main(String[] args) {

        Card[] cards = makeCards();
        System.out.println(cards.length);

        for (Card c : cards) {
            c.printYourSelf();
        }

    }



    public static String getNumberFromInt(int num) {
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


    public static Card[] makeCards() {
        // Spade, Heart, Diamond, Club
        // A, 2~10, J, Q, K
        Card[] card2 = new Card[52];


        String[] kinds = {"Spade", "Heart", "Diamond", "Club"};
        int cnt = 0;

        for (int i = 0; i < kinds.length; i++) {
            for (int z = 1; z <= 13; z++) {
                String number = getNumberFromInt(z); // 1 > "A", 2 > "2", 13 > "K"
                Card c = new Card();
                c.kind = kinds[i];
                c.number = number;
                // cards[(i*13)+(z-1)] = c;
                card2[cnt++] = c;
            }
        }

        return card2;
    }


}
