package com.green.day19.ch7;

public interface PlayingCard2 {
    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;

    public abstract String getCardNumber();
    String getCardKind();
}

interface PlayingChess extends PlayingCard2 {
    void moveHorse(int x, int y);
}

class Chess implements PlayingChess {

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }

    @Override
    public void moveHorse(int x, int y) {

    }
}

class Card implements PlayingCard2 {

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }
}

class PlayingCard2Test {
    public static void main(String[] args) {
        System.out.println(PlayingCard.CLOVER);
    }
}
