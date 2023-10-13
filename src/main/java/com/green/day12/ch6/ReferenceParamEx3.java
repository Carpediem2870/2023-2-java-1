package com.green.day12.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 6, 5, 4};


        printArr(arr); // [3, 2, 1, 6, 5, 4]
        System.out.println(Arrays.toString(arr)); // [3, 2, 1, 6, 5, 4]
        sortArr(arr);


        printArr(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6]

        System.out.println("sum = " + sumArr(arr));
    }

    public static void sortArr(int[] dd) {

        for (int i = dd.length - 1; i > 0; i--) {

            for (int z = 0; z < i; z++) {

                int nIdx = z + 1;

                if (dd[z] > dd[nIdx]) {
                    int tmp = dd[z];
                    dd[z] = dd[nIdx];
                    dd[nIdx] = tmp;
                }

            }
        }
    }

//    public static void printArr(int[] arr) {
//
//        System.out.print("=[");
//        for (int i = 0; i < arr.length-1; i++) {
//            System.out.printf("%d, ",arr[i]);
//        }
//        System.out.printf("%d]=\n", arr[arr.length-1]);
//    }
    public static void printArr(int[] arr) {
        System.out.printf("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.println("]");

    }

    public static int sumArr(int[] arr2) {
        int sum = 0;

        for(int ddddd : arr2) {
            sum+=ddddd;
        }
        return sum;
    }
}

//        for (int i = 0; i < arr2.length; i++) {
//            sum += arr2[i];
//        }
//        return sum;