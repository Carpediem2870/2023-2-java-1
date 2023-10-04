package com.green.day4.ch4;

import java.util.Scanner;

public class if_3 {
    public static void main(String[] args) {

        int val = (int)(Math.random()*100)+1; // 1~100사이 랜덤숫자 나오게

        if (val % 2 == 0) {
            System.out.printf("val값이 %d이면 > \"%d는(은) 짝수입니다.\"", val,val);
        } else {
            System.out.printf("val값이 %d이면 > \"%d는(은) 홀수입니다.\"", val,val);
        }
    //val값이 11이면> "11는(은) 홀수입니다."
    //val값이 12이면> "12는(은) 짝수입니다."
    }
}
