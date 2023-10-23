package com.green.day13.ch6;

public class MyMath2 {
    int num;

    public static int staticNum;

    void instanceAbs() {  // static 사용 불가 인스턴스 변수int num 이 들어가있기 때문)
        System.out.println(num < 0 ? -num : num);
    }
    public static void staticAbs(int n) {
        System.out.println(n < 0 ? -n : n);
    }
    static void print() {
        System.out.printf("staticNum : %d\n", staticNum);
    }

    void print2() {
        System.out.printf("staticNum : %d, num : %d\n", staticNum, num);
    }
}
