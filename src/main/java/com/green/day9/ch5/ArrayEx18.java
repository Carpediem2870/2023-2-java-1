package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                { 101, 102, 103 }
                , { 21, 22, 23 }
                , { 31, 32, 33 }
                , { 41, 42, 43 }
        };

        // 출력
        // score[0][0] = 101
        // score[0][1] = 102
        // score[0][2] = 103
        int sum = 0;

        // sum = ??
        for (int i = 0; i < score.length; i++) {
            int[] arr = score[i];
            for (int j = 0; j < score[i].length; j++) {
                int val = score[i][j];
                System.out.printf("arr[%d][%d] = %d\n",i,j,val);

                //sum = sum + score[i][j];
            }
        }

        // 향상된 for문을 이용하여 sum값을 구하고 싶다. 위의 문장과 같은 내용임.
        for (int[] arr : score) {
            for (int val : arr) {
                sum += val;
            }
        }

        System.out.println("sum = "+ sum);
    }
}
