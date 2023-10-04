package com.green.day3.ch4;

public class AssignmentOperators2 {
    public static void main(String[] args) {
        int r1 = 0, n1 = 0, a1 = 0;
        ++a1;
        r1 = ++n1; // n1에 ++ 먼저 하고 r2로 복사
        System.out.printf("r1: %d, n1: %d, a1: %d\n", r1, n1, a1);

//        int r2 = 0, n2 = 0;
//        r2 = n2++;
//        System.out.printf("r2: %d, n2: %d\n", r2, n2);

        int r2 = 0, n2 = 0, a2 = 0;
        r2 = n2++; // n2 0값을 먼저 r2로 복사하고 ++ 진행됨
        a2++;
        System.out.printf("r2: %d, n2: %d, a2: %d\n", r2, n2, a2);


    }
}
