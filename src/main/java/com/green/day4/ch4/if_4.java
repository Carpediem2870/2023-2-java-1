package com.green.day4.ch4;

public class if_4 {
    public static void main(String[] args) {

        //50 ~ 200 사이 랜덤값
        //100이하면 그 값으 *2한 결과값
        //100초과면 그 값의 +10한 결과값

        int val = (int)(Math.random()*151)+50;

        if (val <= 100) {
            val = val * 2;
        } else {
            val = val + 10;
        }
        System.out.println(val);

    }
}
