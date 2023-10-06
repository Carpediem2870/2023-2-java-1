package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMission_T {
    // 숫자 넣고 콤마넣고 마지막에 콤마빼기
    public static void main(String[] args) {
        int[]arr = {5, 10, 7, 3};
        System.out.println(Arrays.toString(arr));
        //for문을 활용하여 콘솔에 [5, 10, 7, 3] 출력되도록 하시오.

        int commaLen = arr.length-1;
        //===========================
        System.out.println("=======================");

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length-1) {
                System.out.printf("%d, ", arr[i]);
            } else {
                System.out.printf("%d", arr[i]);;
            }
        }
        System.out.print("]");

        System.out.println();
        System.out.println("=======================");

        //=============================

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i < commaLen ? arr[i] + ", " : arr[i]);
        }
        System.out.print("]");

        System.out.println();
        System.out.println("=======================");

        //=============================
    }
}
