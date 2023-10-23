package com.green.day13.ch6;



class Card {

    String pattern;  // Spade, Heart
    String denomination; // A, 2~10, J, Q, K

    void printYourSelf () {

        System.out.printf("%s-%s\n", pattern, denomination);
    }

    /*public static String getNumberpoint(int num) {

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
        return Integer.toString(num);
    }*/


}


public class CardTest3 {
    public static void main(String[] args) {

        Card c = new Card();
        c.pattern = "Spade";
        c.denomination = "A";
        c.printYourSelf();


        Card c2 = new Card();
        c2.pattern = "Heart";
        c2.denomination = "J";
        c2.printYourSelf();


        Card[] cards = makeCards();
        System.out.println(cards.length);

        for (Card ddd  : cards) {
            ddd.printYourSelf();
        }

    }
    public static Card[] makeCards() {
        Card[] cards = new Card[52];

        String[] pattern = {"Spade", "Heart", "Diamond", "Club"};
        String[] denomination = {"A", "2","3", "4", "5", "6", "7", "8", "9","10","J","Q","K"};
        int tmp = 0;

        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < denomination.length; j++) {
                Card c = new Card();

                c.pattern = pattern[i];
                c.denomination = denomination[j];

                cards[tmp++] = c;

            }

        }

        return cards;
    }
}
