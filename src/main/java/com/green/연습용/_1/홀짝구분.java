package com.green.연습용._1;

public class 홀짝구분 {
    public static void main(String[] args) {
        int a = 2;

        String result = (a%2 == 0) ? "is even" : "is odd";

        System.out.printf("%d %s",a,result);
    }
}
