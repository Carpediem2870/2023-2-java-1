package com.green.day10.ch6;

public class ReturnNumberBox {

    int sum(int n1, int n2) {
        return n1 + n2;
    }



    int abs(int n) {
        return n < 0 ? -n : n;
    }

    // 위 아래 차이가 있는지 물어보기
    int bbs(int n) {
        int result = n < 0 ? -n : n; // -result;
        return result;
    }

}