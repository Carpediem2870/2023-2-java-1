package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.channel = 10;
        tv1.power = true;
        tv1.color = "빨강색";


        Tv tv2 = new Tv();
//        tv2.channel = 20;          인트타입은 0
//        tv2.power = false;         boolean 형이기 때문에 디폴드값이 false
//        tv2.color = "파랑색";       tv2의 컬러는 초기화 된적이 없으면 null

        System.out.println("tv1.channel : " + tv1.channel);
        System.out.println("tv1.power : " + tv1.power);
        System.out.println("tv1.color : " + tv1.color);

        System.out.println("=================");

        System.out.println("tv2.channel : " + tv2.channel);
        System.out.println("tv2.power : " + tv2.power);
        System.out.println("tv2.color : " + tv2.color);
    }
}
