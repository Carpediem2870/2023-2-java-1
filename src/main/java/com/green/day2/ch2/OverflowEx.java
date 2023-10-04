package com.green.day2.ch2;

public class OverflowEx {
    public static void main(String[] args) {
        int intVal = 5;
        byte byteVal = (byte)intVal;
        System.out.printf("byteVal : %d\n", byteVal);


        //오버 플로우 Overflow
        int intVal2 = 129;
        byte byteVal2 = (byte)intVal2;
        System.out.printf("byteVal2 : %d\n", byteVal2);

        //언더 플로우 Underflow
        int intVal3 = -130;
        byte byteVal3 = (byte) intVal3;
        System.out.printf("byteVal3 : %d\n", byteVal3);

    }
}
