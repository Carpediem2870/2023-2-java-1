package com.green.day4.ch4;

public class if_3연습 {
    public static void main(String[] args) {

        //val값이 11이면> "11는(은) 홀수입니다."
        //val값이 12이면> "12는(은) 짝수입니다."

        int val = (int)(Math.random()*100)+1; // 1~100사이 랜덤숫자 나오게

        String result = (val %2 ==0) ? "짝수" : "홀수";

        System.out.printf("val값이 %d이면 > \"%d는(은) %s입니다.\"", val,val,result);
    }
}
