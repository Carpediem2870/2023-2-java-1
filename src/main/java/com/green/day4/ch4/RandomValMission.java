package com.green.day4.ch4;

public class RandomValMission {
    public static void main(String[] args) {


        int rVal1 = (int)(Math.random()*6)+5; // 5 ~ 10
        System.out.println("rVal : " + rVal1);


        int rVal2 = (int)(Math.random()*10)+14; // 10 ~ 11
        System.out.println("rVal : " + rVal2);
    }
}