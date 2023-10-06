package com.green.연습2;

public class Array1 {
    public static void main(String[] args) {
        int sum = 0;
        float aver = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        aver = sum/(float) score.length;
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + aver);
    }
}
