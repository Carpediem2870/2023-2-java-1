package com.green.day7.ch5;

public class Array3Mission_test {
    public static void main(String[] args) {
        // arr2는 길이가 4. arr1과 같은 방은 같은 값을 가지고 있고
        // 3번 방은 20을 갖고 있는 배열을 만들어 주세요

        int[] arr = {10, 15, 20};
        int[] tmp = {arr.length + 1};

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = arr[i];
            if (i == tmp.length - 1) {
                arr[i] = 20;
            }
        }
        for (int i = 0; i < tmp.length; i++) {
            System.out.printf("arr2 : [%d]: %d", i, tmp[i]);
        }

    }
}

