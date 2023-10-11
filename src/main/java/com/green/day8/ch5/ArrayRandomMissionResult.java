package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayRandomMissionResult {
    public static void main(String[] args) {

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*5)+1;
            System.out.println(arr[i]);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
