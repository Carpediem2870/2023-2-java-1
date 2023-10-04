package com.green.day4.ch4;

import java.util.Scanner;

public class If_1연습2 {
    public static void main(String[] args) {
        // Scanner를 이용하여 성별을 입력 (남자, 여자)
        // 만약에 남자가 입력되었다면 콘솔에 "잘 생겼다." 출력
        // 만약에 여자가 입력되었다면 콘솔에 "예쁘다." 출력
        // 남자, 여자가 아닌 값이 입력되었다면 "누구냐." 출력

        Scanner scanner = new Scanner(System.in);
        System.out.println("성별을 입력하세요(남자, 여자) >> ");
        String sss = scanner.nextLine();
        String ddd = "누구냐?";

        if (sss.equals("남자")) {
            ddd = "잘생겼다.";
        } else if (sss.equals("여자")) {
            ddd = "예쁘다.";
        }
        System.out.printf("%s", ddd);

    }
}
