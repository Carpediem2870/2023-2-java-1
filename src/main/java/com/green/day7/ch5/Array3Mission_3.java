package com.green.day7.ch5;

public class Array3Mission_3 {
    public static void main(String[] args) {
        // arr2는 길이가 4. arr1과 같은 방은 같은 값을 가지고 있고
        // 3번 방은 20을 갖고 있는 배열을 만들어 주세요

        int[] arr1 = {5, 10, 15,  16, 17};
        int[] arr2 = new int[arr1.length+1];

    /*    for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]); // arr2번에 방 생긴거 확인
        }*/

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
            System.out.printf("arr1[%d] : %d\n",i, arr1[i]);
        }
        System.out.println("----------------------");

        arr2[arr1.length] = 20;
        System.out.println("================");

        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
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

