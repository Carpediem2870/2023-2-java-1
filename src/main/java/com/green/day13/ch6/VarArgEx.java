package com.green.day13.ch6;

public class VarArgEx {


    public static void sum(int... arr){

        int n = 0;
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
                summ += arr[i];
        }
        System.out.printf("sum = %d\n",summ);
    }
    public static void main(String[] args) {
        sum(10, 20);
        sum(10, 20, 30);
        sum(10, 20, 30, 40);
        sum(10, 20, 30, 40, 50);

    }
}
