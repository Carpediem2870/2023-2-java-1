package com.green.day7.ch5;

public class Array2 {

    //쉘로카피 - 공간을 그대로 복사
    public static void main(String[] args) {
        int[] arr1 = {100, 200};
        int[] arr2 = {5, 10, 15};

        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);

        }
        arr1 = arr2;
        System.out.println("-------------------");
        arr1[1] = 44;
        arr2[2] = 55;

        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }
        System.out.println("===================");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }
    }
}
