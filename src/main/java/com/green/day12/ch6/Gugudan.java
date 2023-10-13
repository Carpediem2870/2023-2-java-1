package com.green.day12.ch6;

public class Gugudan {

    void print(int gd) {

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", gd, i, gd*i);
        }
    }

    void printFromTo(int gd1, int gd2) {
        for (int i = gd1; i <= gd2; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
        }
    }

    void printFromTo(int min, int max, String a) {
        for (int i = min; i <= max; i++) {
            print(i);
            System.out.println(a);

        }
    }
}
