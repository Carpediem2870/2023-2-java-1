package com.green.day19.ch7;

public interface PlayingCard {
    // 다중 생성 가능.
    // 부모의 역할만 한다.
    // 타입으로서만 주소값 담을 수 있다.
    // 객체화는 안된다.
    // 오버라이딩은 무조건 해야한다. (추상메서드)
    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;

    //
    public abstract String move();

    String kkk();
}

//
interface wow extends PlayingCard {
    void PlayingCard(int a, int b);

}

class Playing2 implements PlayingCard {
    public String move() {
        return null;
    }
    public String kkk() {
        return null;
    }

}

class PlayingCardTest {
    public static void main(String[] args) {
        System.out.println(PlayingCard.HEART);
        System.out.println(PlayingCard.SPADE);
        System.out.println(PlayingCard.CLOVER);
    }
}