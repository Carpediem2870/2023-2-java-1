package com.green.day7.ch4;

public class FlowEx29_T {
    public static void main(String[] args) {
        // 369게임
        // i=1
        // i=2
        // i=3 짝
        // i=30 짝


        for (int i = 0; i <= 100; i++) {
            System.out.printf("i=%d ", i);
            int ddd = i;

            do {if (ddd%10%3==0 && ddd%10 != 0)
                System.out.print("짝");
            } while ((ddd/=10) != 0);
                System.out.println();
        }
    }
}
