package com.green.day2.ch2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("숫자를 입력하세요 : ");

        int number = scanner.nextInt();

        System.out.println("입력한 숫자를 곱한 값은? : " + number * number);

    }
}
