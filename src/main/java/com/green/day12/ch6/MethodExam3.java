package com.green.day12.ch6;

public class MethodExam3 {

    int sumText(String str) {
        int sum = 0;
        int a = Integer.parseInt(str);
        for (int i = 0; i < str.length(); i++) {

            sum += a % 10;
            a = a / 10;
            sum += a;

        } return sum;

    }
    public static void main(String[] args) {

        MethodExam3 me3 = new MethodExam3();
        int sum = me3.sumText("123123");

        System.out.println("sum : " + sum); // 12
        System.out.println("sum2 : " + me3.sumText("111")); // 6
    }
}
