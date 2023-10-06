package com.green.day8.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score = {100, 88, 100, 100, 90}; // 누군가 받은 과목들의 점수

        //총 점수
        //평균 점수

        int sum = 0;
        double avr = score.length;

        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }
        System.out.println("총점 : " + sum);

        System.out.println("평균 : " + sum/avr);
    }
}
