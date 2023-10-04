package com.green.day2.ch3;

public class _03_OperatorEx18 {
    public static void main(String[] args) {

        float f1 = 15.1f, f2 = 15.6f, f3 = 15.9f;

        //ceil > 올림
        System.out.printf("ceil(%f): %f\n", f1, Math.ceil(f1));    // ceil은 1만 있어도 올림처리 해줌 반올림아니고 올림임
        System.out.printf("ceil(%f): %f\n", f1, Math.ceil(f2));    // ceil은 1만 있어도 올림처리 해줌 반올림아니고 올림임
        System.out.printf("ceil(%f): %f\n", f1, Math.ceil(f3));    // ceil은 1만 있어도 올림처리 해줌 반올림아니고 올림임
        System.out.printf("ceil(%f): %f\n", 15.0001, Math.ceil(15.0001));    // ceil은 0은 올림처리 안해줌
        // ★★★ 0.00000001 이 있어도 1올려줌 ★★★

        System.out.println();
        //floor > 내림
        System.out.printf("floor(%f): %f\n", f1, Math.floor(f1));    // floor은 1만 있어도 내림처리 해줌
        System.out.printf("floor(%f): %f\n", f2, Math.floor(f2));
        System.out.printf("floor(%f): %f\n", f3, Math.floor(f3));

        System.out.println();
        //round > 반올림         // ★★★ %d를 써야함 %f아님 자바만 특별하게 이렇게 씀 ★★★

        System.out.printf("round(%f): %d\n", f1, Math.round(f1));    // round는 반올림 및 %d로 정수로 해야함
        System.out.printf("round(%f): %d\n", 15.5, Math.round(15.5));    // round는 반올림
        System.out.printf("round(%f): %d\n", 15.09, Math.round(15.09));    // round는 반올림
        System.out.printf("round(%f): %d\n", 15.49, Math.round(15.49));    // round는 반올림
        System.out.printf("round(%f): %d\n", f1, Math.round(f2));    // round는 반올림
        System.out.printf("round(%f): %d\n", f1, Math.round(f3));    // round는 반올림
    }
}
