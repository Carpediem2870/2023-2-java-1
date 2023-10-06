package com.green.연습2;

public class ArrayEx3 {
    public static void main(String[] args) {
        //배열 arr[]에 1~5를 저장한다.

        //결과 : 변경전

        int[] arr = new int[5];
        System.out.println("111111111111111111111111111");

        System.out.println("[변경 전]");
        System.out.println("arr.length:" + arr.length);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "]:" + arr[i]);
        }

        System.out.println("2222222222222222222222222222");

        int[] tmp = new int[arr.length * 2];



        for (int i = 0; i < arr.length; i++) {

            tmp[i] = arr[i];
            arr = tmp;

        }
        System.out.println("[변경 후]");
        System.out.println("arr.length:" + tmp.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
        }
    }
}