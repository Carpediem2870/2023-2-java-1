package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMission {
    public static void main(String[] args) {
        int[]arr = {5, 10, 7, 3};
        int commaLen = arr.length-1;
        System.out.println(Arrays.toString(arr));
        //for문을 활용하여 콘솔에 [5, 10, 7, 3] 출력되도록 하시오.
        for (int i = 0; i < arr.length; i++) {
            if (i<1)
            System.out.print("[");
            for (int j = 0; j < commaLen; j++) {
                System.out.print(arr[i]);
                    System.out.print(", ");
                if (arr[i] == arr[3]) {
                }

                if (i<1){
                    break;
                }
                if (j<1){
                    break;
                }
            }
        }
        System.out.print("]");
    }
}
