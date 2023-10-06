package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMissionResult2 {

    // 콤마 먼저 찍고 괄호넣는데 처음 콤마는 빼기
    public static void main(String[] args) {

        int[] arr = {5, 10, 7, 3, 11, 100};
        int commaLen = arr.length-1;
        System.out.println(Arrays.toString(arr));

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {

            if (i != 0) {
                System.out.print(", ");

            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}
