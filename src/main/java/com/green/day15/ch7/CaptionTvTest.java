package com.green.day15.ch7;

import com.green.day14.ch6.Car;

class Tv{
    boolean power;
    int channel;
    void power() { power = !power; }
    void channelUp() { channel++; }
    void channelDown() { channel--; }
}

class CaptionTv extends Tv {

    @Override
    void channelUp() {

        channel += 2;
    }

    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}


public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        System.out.printf("cTv.power : %b\n",cTv.power);

        cTv.power();
        System.out.printf("cTv.power : %b\n",cTv.power);

        cTv.channel = 10;
        cTv.channelUp();
        System.out.printf("cTv.channel : %d\n", cTv.channel);

        cTv.caption = true;
        cTv.displayCaption("반갑다 친구들!!!");
        cTv.displayCaption("ㅁㄴㅇㅁㄴㅇㅁ");


    }
}
