package com.green.연습용._1;

public class t0008 {
    public static void main(String[] args) {
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j <=5; j++) {
                if (i==j) {
                    System.out.printf("[%d,%d]",i,j);
                } else {
                    System.out.printf("%5c",' ');
                }
            }
            System.out.println();

        }
    }
}