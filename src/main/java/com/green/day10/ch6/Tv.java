package com.green.day10.ch6;

public class Tv {

    // 멤버필드, 속성, property
    String color;
    boolean power;
    int channel;

    // 멤버메소드, 메소드

    void power() { power = !power; }
    void channelUp() { channel++; }
    void channelDown() { channel--; }

}
