package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayRandomMission_T {
    public static void main(String[] args) {

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10)+1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));  // toString 은 이미 안에서 for문이 돌게끔 로직되어있어서 나오는거

    }
}