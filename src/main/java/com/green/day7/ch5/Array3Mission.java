package com.green.day7.ch5;

import java.util.Arrays;
import java.util.Scanner;

public class Array3Mission {
    public static void main(String[] args) {
        // arr2는 길이가 4. arr1과 같은 방은 같은 값을 가지고 있고
        // 3번 방은 20을 갖고 있는 배열을 만들어 주세요

        int num = 0;

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        num = Integer.parseInt(input);

        int[] arr1 = {5, 10, 15};
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[num];
        System.out.println(Arrays.toString(arr2));

    /*    for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]); // arr2번에 방 생긴거 확인
        }*/

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[3] = 20;
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d] : %d\n",i, arr2[i]);
        }
        /*     int[] arr1 = {5, 10, 15};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length + 1);
        arr2[arr1.length] = 20;

        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
        }*/
//        arr2[3] = 20;
//
//
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = arr1[i];
//            arr2[3] = 20;
//            System.out.println(arr2[i]);
    }

}

