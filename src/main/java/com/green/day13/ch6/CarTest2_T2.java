package com.green.day13.ch6;

import com.green.day12.ch6.Card;


class Card2{
    String pattern;
    String denomination;
    void printYourself() {
        System.out.printf("%s - %s\n",pattern,denomination);
    }
}
public class CarTest2_T2 {

    public static void main(String[] args) {
        Card2 card1 = new Card2();
        // 52개의 배열카드
        Card2[] cards = makeCards2();
        System.out.println(cards.length);

        for (Card2 ddd : cards) {
            ddd.printYourself();
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
        return  Integer.toString(num); // String.valueof(num);
    }


    public static Card2[] makeCards2() {
        // Spade, Heart, Diamond, Club
        // A, 2~10, J, Q, K
        Card2[] cArr = new Card2[52];

        String[] patterns = {"Spade", "Heart", "Diamond", "Club"};

        for (int i = 0; i < cArr.length; i++) {
            String pattern = patterns[i/13];
            String denomination = getNumberFromInt((i + 1) % 13);
            cArr[i] = new Card2();
            cArr[i].pattern = pattern;
            cArr[i].denomination = denomination;
        }
        return cArr;
    }
}
