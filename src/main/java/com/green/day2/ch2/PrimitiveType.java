package com.green.day2.ch2;

public class PrimitiveType {
    public static void main(String[] args) {
//        논리형
        boolean test = true, test2 = false;

//        문자형 (정수형이다.)
        char ch = 'a', ch2 = '가';

//        정수형
        byte b1 = 127;
        short s1 = 10;
        int i1 = 100;
        long l1 = 1000;
        // int i1 = 100l; << l붙으면 long타입이됨

//        실수형
//        float f1 = 10.1;
        // 10.1 은 double 타입이기때문에 아래 10.1f 플롯형태로 쓰거나
        // 앞에 (float)로 선언해줘야 사용 가능.
        float f2 = 10.1f, f3 = 10.1F;
        float f4 = (float)10.1;  // 강제 형 변환
        double d1 = 10.1; // 10.1d (더블) 10.1D 이렇게 써도 됨.

        float f5 = (float) d1;

    }
}
