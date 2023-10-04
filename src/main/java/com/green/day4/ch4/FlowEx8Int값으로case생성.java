package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx8Int값으로case생성 {
    public static void main(String[] args) {
        System.out.println("당신의 주민번호를 입력하세요. (011231-1111222)");
        //주민등록번호 입력받고, 주민번호를 확인하고 여자인지 남자인지, 유효하지않은 주민등록번호인지 출력
        Scanner scanner = new Scanner(System.in);
        String humanId = scanner.nextLine();
        char gender = humanId.charAt(7);
        int num = Character.getNumericValue(gender);
        // String gender = String.valueOf(humanId.charAt(7)); 스위치 본문 case에 "1", "3": 처럼 큰따옴표가 들어갈 수 있음

        switch(num) {
            case 1, 3:
                System.out.println("남자 입니다.");
                break;

            case 2, 4:
                System.out.println("여자 입니다.");
                break;

            default:
                System.out.println("유효하지 않은 주민번호입니다.");
        }
    }
}
