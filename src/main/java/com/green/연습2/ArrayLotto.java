package com.green.연습2;

public class ArrayLotto {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i+1;
        }

        int tmp = 0;
        int j = 0;

        for (int i = 0; i < 6; i++) {
            j = (int)(Math.random()*6);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
            System.out.print("j="+j+", ");
            System.out.println("ball[j] = "+ball[j]);

        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d]=%d%n", i, ball[i]);

        }
    }
}
//맥북 업로드 가능 테스트
// 테슽 222222
/////////////////////