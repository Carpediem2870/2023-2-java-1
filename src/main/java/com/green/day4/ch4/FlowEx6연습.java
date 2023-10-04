package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx6연습 {
    public static void main(String[] args) {

        System.out.println("현재 월을 입력하세요 >>");
        Scanner scanner = new Scanner(System.in);
        int mon = scanner.nextInt();
        String aaa = "";
        // mon값이 3~5사이면 봄
        // mon값이 6~8사이면 여름
        // mon값이 9~11사이면 가을
        // mon값이 3~5사이면 봄 (디폴트)


        switch(mon) {

            case 3, 4, 5:
                aaa = "봄 입니다.";
                break;
            case 6, 7, 8:
                aaa = "여름 입니다.";
                break;
            case 9, 10, 11:
                aaa = "가을 입니다.";
                break;

            default:
                System.out.println("겨울 입니다.");
        }
        System.out.printf("%s",aaa);
    }
}
