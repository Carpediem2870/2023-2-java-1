package com.green.day10.ch6;

public class ReturnNumberBoxTest {
    public static void main(String[] args) {
        ReturnNumberBox rnb = new ReturnNumberBox();
        int r1 = rnb.sum(10, 20);
        System.out.println("r1 : "+r1);
        int r2 = rnb.sum(20, 30);
        System.out.println("r1 : "+r2);
        System.out.println("-- 끝 --");

        int r3 = rnb.abs(-10);
        System.out.println("r1 : "+r3); // 10

        System.out.println("r4 : "+rnb.abs(10)); // 10
        System.out.println("r4 : "+rnb.abs(-99)); // 99
        System.out.println("r4 : "+rnb.abs(98)); // 98

        System.out.println("==================");

        int r4 = rnb.bbs(-10);
        System.out.println("r1 : "+r4); // 10

        System.out.println("r4 : "+rnb.bbs(10)); // 10
        System.out.println("r4 : "+rnb.bbs(-99)); // 99
        System.out.println("r4 : "+rnb.bbs(98)); // 98


    }
}
