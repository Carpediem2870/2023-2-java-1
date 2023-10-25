package com.green.day19.ch7;

class PlayerTest {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(10);
        VideoPlayer vp = new VideoPlayer();
        vp.play(20);
        Player player = ap;
        player.play(30);
        player  = vp;
        player.play(40);
        ap.play(50);
        vp.play(60);
    }
}

public abstract class Player {
    public abstract void play(int pos);
    // 추상클래스는 객체화가 안된다. 부모클래스로만 활용.
    // 부모가 메서드가 없어서 자식클래스에서 오버라이딩해야하는 강제성이 있다.

}

class AudioPlayer extends Player {


    @Override
    public void play(int pos) {
        System.out.println("Audio Play 위치 : " + pos);
    }
}

class VideoPlayer extends Player {

    @Override
    public void play(int pos) {
        System.out.println("Video Play 위치 : " + pos);

    }
}