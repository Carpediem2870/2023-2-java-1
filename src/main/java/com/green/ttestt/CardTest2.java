package com.green.ttestt;


class Card3 {
   String kind;
   String number;

    void printYourself() {
        System.out.printf("%s - %s\n",kind,number);
    }
}
public class CardTest2 {
    public static void main(String[] args) {
        Card3[] cards = makeCards();
        System.out.println(cards.length);

        for (Card3 ddd : cards) {
            ddd.printYourself();
        }
    }
    public static Card3[] makeCards(){
        Card3[] Arr = new Card3[52];
        String[] kind = {"Space", "Heart", "Club", "Diamond"};
        int cnt = 0;

        for (int i = 0; i < kind.length; i++) {
            for (int j = 1; j <= 13; j++) {
                String number = CardFromTo(j);
                Card3 c = new Card3();
                c.kind = kind[i];
                c.number = number;
                Arr[cnt++] = c;
            }
        }
        return Arr;
    }
    static String CardFromTo(int j){
        switch (j){
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return Integer.toString(j);
    }
}














