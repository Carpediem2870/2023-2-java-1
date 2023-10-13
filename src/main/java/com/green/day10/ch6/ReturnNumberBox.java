package com.green.day10.ch6;

public class ReturnNumberBox {

    // void가 없는 경우 return 돌아갈 값을 기입해야한다.
    int sum(int n1, int n2) {
        return n1 + n2;
    }



    int abs(int n) {
        return n < 0 ? -n : n;
    }

    int bbs(int n) {
        int result = n < 0 ? -n : n; // -result;
        return result;
    }

}