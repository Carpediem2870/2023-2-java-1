package com.green.day3.ch4;

public class OperatorEx32Mission {
    public static void main(String[] args) {
        // 만약에 n이 (음수 아무값) -10이었다면 콘솔에 10이 출력
        // 만약에 n이 (양수 아무값) 9이었다면 콘솔에 9가 출력
        int n = 99;
//        n = n * -1;
//        n = -n;


        System.out.println("n : " + (n > 0 ? +n : -n));

        if (n > 0) {
            System.out.println(n);
        }
        else {
            System.out.println(-n);  // -n = -1*n , -2n은 안됨 n * -2 해야함.
        }
    }
}
