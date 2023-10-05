package com.green.day7.ch5;

public class Array3 {

    //딥 카피 - 공간이 같더라도 공간 중 일부 값을 다른 값으로 단독 변경가능.
    public static void main(String[] args) {
        int [] arr1 = {5, 10, 15};
        int [] arr2 = {50, 100, 150, 20};

        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }

        // 동등성(equals), 동일성 ( == )
        // 쉘로카피는 동등성, 동일성 트루
        // 딥카피는 동등성은 트루, 동일성은 펄스

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr1[1] = 200;

        System.out.println("----------------------------");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }

        System.out.println("----------------------------");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }
    }
}
