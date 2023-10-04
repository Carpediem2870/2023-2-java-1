package com.green.day2.ch3;

public class _02_OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        System.out.println(pi);

        int pro1 = (int)(pi * 1000);
        System.out.println("pro1 : " + pro1);

        float pro2 = pro1 *0.001f; // pro1 / 1000f 랑 같음, 곱하기가 더 빨리연산되서 가급적 곱하기로 하는게 좋음
        System.out.println("pro2 : " + pro2);

        System.out.println("one : " + (int)(pi * 1000) * 0.001f);

    }
}
