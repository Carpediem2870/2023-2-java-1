package com.green.day2.ch3;

public class _06_OperatorEx23 {
    public static void main(String[] args) {
        //비교 연산자
        String s1 = "Hello", s2 = "Hello";
        String s3 = new String("Hello");


        System.out.printf("%s == %s : %b\n", s1, s2, s1 == s2); // 주석값 비교 == 동일성 비교
        System.out.printf("%s == %s : %b\n", s1, s3, s1 == s3);

        // ★★★ 자바에서 문자열 비교는 == 이 아니라 equals 를 반드시 써야함
        System.out.printf("%s.equals(%s) : %b\n", s1, s3, s1.equals(s3)); // String 문자열 비교 equals 동등성 비교
        System.out.printf("%s.equals(%s) : %b\n", s3, s1, s1.equals(s1));

        //reference
        System.out.println();

    }
}



