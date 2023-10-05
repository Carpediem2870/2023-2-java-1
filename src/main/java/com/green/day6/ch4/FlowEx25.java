package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.println("숫자를 입력하세요.(예:12345) >> ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        //12345 >> 15
        // 2233 >> 10
        // 23 >> 5
        while(num != 0) {
          /*  int modVal = num % 10;
            num = num/10; // == num /= 10;
            sum += modVal;*/
            // 위의 3줄 같은내용
            sum += num % 10; // sum = sum + num % 10;
            num /= 10; // num = num / 10;
        }
        System.out.println("결과 >>" + sum);
    }
}
