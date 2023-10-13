package com.green.day11.ch6;

public class StarPrintTest {

    public static void main(String[] args) {
        StarPrint sp = new StarPrint();

        for (int i = 0; i < 5; i++) {
            sp.line(5); // ***** 갯수만큼 줄
        }
        sp.line(7); // *****
        System.out.println("------------");
        sp.square(10);

        System.out.println("======triangle======");
        sp.triangle(5);
        //*
        //**
        //***
        //****
        //*****

        String gender = sp.chkGenderById("011234-5117111");

        System.out.println(gender);
        // 8번째 자리의 숫자가 2, 4이면 여성
        // 8번째 자리의 숫자가 1, 3이면 남성
        // 이외의 값이면 >> 유효하지않은 주민번호


        int sum = sp.sumFromTo(4, 10);
        int sum2 = sp.sumFromTo(10, 15);

        System.out.println(sum);
        System.out.println(sum2);
        // 4~10까지 전부 더한값을 리턴해주는것
        // 10~15까지 전부 더한값을 리턴해주는것
    }
}

