package com.green.day10.ch6;

public class NumberBoxTest {

    public static void main(String[] args) {

       NumberBox nb1 = new NumberBox();

       nb1.sum(10, 20);
       nb1.sum(30, 40); // 호출 당시 값으로 출력


        nb1.minus(40,20);
        nb1.minus(40,10);


        nb1.abs(-10); // 10
        nb1.abs(10); // 10
        nb1.abs(-33); // 33
        nb1.abs(39); // 39

    }
}
