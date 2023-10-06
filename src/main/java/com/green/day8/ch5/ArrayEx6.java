package com.green.day8.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {

        int[] score = {79, 88, 91, 33, 100, 55, 95};

        // score 안에서 min값과 max값을 찾아서 출력해 주세요.

        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {

            if (max < score[i]) {
                max = score[i];

            } else if (min > score[i]) {
                min = score[i];
            }
        }
        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
