package com.green.day3.ch4;

public class AssignmentOperators {
    public static void main(String[] args) {
        //복합 대입 연산자
        int n1, n2, n3;
        n3 = 10; // 대입 연산자
        n1 = n2 = n3;

        System.out.printf("n1: %d, n2: %d, n3: %d\n", n1, n2, n3);

        n1 = n1 + 4;
        System.out.printf("n1: %d, n2: %d, n3: %d\n", n1, n2, n3);

        n2 += 4;  // n2 = n2 + 4 랑 같은 개념
        System.out.printf("n1: %d, n2: %d, n3: %d\n", n1, n2, n3);

        n3++; // n3 = n3 + 1\
        ++n3;
        System.out.printf("n1: %d, n2: %d, n3: %d\n", n1, n2, n3);

        n2--;
        --n2;
        System.out.printf("n1: %d, n2: %d, n3: %d\n", n1, n2, n3);

    }
}
