package com.green.연습용;

public class CallStackTest {
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 사작되었음 + 1.");
        firstMethod();
        System.out.println("main(String[] args)이 끝났음. + 6");
    }

    static void firstMethod() {
        System.out.println("firstMethod()이 사작되었음 + 2.");
        System.out.println("firstMethod()이 끝났음. + 5");

    }
    static void secondMethod() {
        System.out.println("secondMethod()이 시작되었음 + 3.");
        System.out.println("secondMethod()이 끝났음 + 4.");
    }
}
