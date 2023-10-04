package com.green.day2.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 객체는 속성(값저장, 명사), 메소드(기능,동사)
        System.out.println("두자리 정수를 하나 입력해주세요 >>");
        String input = scan.nextLine();  // scan 은 입력을 기다린다. 입력+Enter
        int num = Integer.parseInt(input); // Integer는 문자열을 정수형으로 바꾸고싶을 때 쓸 수 있음.


        System.out.println("입력내용: " + input);
        System.out.printf("num=%d\n", num);
        System.out.printf("num=%d\n", num + num);


//        double num = Double.parseDouble();
        // 실수 타입으로 할때
//        double num = Double.parseDouble(input);
//
//        System.out.println("입력내용: " + input);
//        System.out.printf("num=%f\n", num);
//        System.out.printf("num=%f\n", num + num);
    }
}
