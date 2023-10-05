package com.green.day7.ch4;

public class BreakContinue3 {
    public static void main(String[] args) {
        abc:
        for (int i = 0; i < 5; i++) {

            for (int j = 10; j < 15; j++) {
                if (j == 13) { continue abc;}
                System.out.printf("i:%d - z:%d\n", i, j);
            }
        }
        System.out.println("=================");
        for (int i = 0; i < 5; i++) {

            for (int j = 10; j < 15; j++) {
                if (j == 13) { break;}
                System.out.printf("i:%d - z:%d\n", i, j);
            }
        }
    }
}
