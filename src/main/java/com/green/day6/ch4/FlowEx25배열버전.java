package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx25배열버전 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.println("숫자를 입력하세요.(예:12345) >> ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            sum += Character.getNumericValue(arr[i]);
        }
        System.out.println("결과 : " + sum);
    }
}
