package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission_Test2 {
    public static void main(String[] args) {
        // 남자의 평균키 170, 여자의 평균키 157
        // Scanner이용하여 성별을 입력 받습니다. (남, 여)
        // 키를 입력 받습니다.
        // 평균키 미만이면 "156cm는 남 평균 이하입니다.
        // 평균키랑 같다면 "170cm는 평균입니다."
        // 평균키 초과면 "170cm는 남자 평균 초과입니다."

        Scanner scanner = new Scanner(System.in);
        System.out.println("성별을 입력해 주세요. 남자/여자 >>");
        String gender = scanner.nextLine();
        System.out.println("키를 입력해 주세요.");
        int height = scanner.nextInt();

    }
}