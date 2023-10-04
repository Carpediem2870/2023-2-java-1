package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {

//        Scanner
//        if
        // (콘솔) 숫자를 하나 입력하세요 >
        // 입력을 기다려야함
        // 숫자를 입력하고 엔터를 누르면
        // String 변수에 해당값이 저장될 수 있도록
        // 해당 문자열을 > 정수형으로 형변환
        // 해당 숫자가 0이라면 콘솔에 "입력하신 숫자는 0입니다."
        // 해당 숫자가 0이 아니라면 콘솔에 "입력하신 숫자는 0이 아닙니다."

        Scanner scanner = new Scanner(System.in); // Scanner 은 여러번 입력이 필요할 때에도 한번만 입력하면 됨.

        System.out.print("숫자를 하나 입력하세요> ");
        String input = scanner.nextLine();  // scan 은 입력을 기다린다. 입력+Enter
        int num = Integer.parseInt(input);

        if (num == 0) {
            System.out.println("입력하신 숫자는 " + num + "입니다.");
        } else {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
            System.out.println("입력하신 숫자는"+num+"입니다.");
        }
    }
}
