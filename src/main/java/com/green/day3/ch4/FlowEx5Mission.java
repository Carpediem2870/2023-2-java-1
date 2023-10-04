package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission {
    public static void main(String[] args) {
        // 남자의 평균키 170, 여자의 평균키 157
        // Scanner이용하여 성별을 입력 받습니다. (남, 여)
        // 키를 입력 받습니다.
        // 평균키 미만이면 "156cm는 남 평균 이하입니다.
        // 평균키랑 같다면 "170cm는 평균입니다."
        // 평균키 초과면 "170cm는 남자 평균 초과입니다."


        String gender = " ";
        System.out.println("성별을 입력하세요> ");
        Scanner scan = new Scanner(System.in);
        gender = scan.nextLine();
        System.out.println("키를 입력하세요> ");
        int height = scan.nextInt();
        String aver = "평균";

        if (gender.equals("남자")) {

            if (height > 170) {
                aver = "평균 초과";
            } else if (height < 170) {
                aver = "평균 미만";
            }
            System.out.printf("%dcm는 %s 키 %s입니다.", height, gender, aver);


        } else if (gender.equals("여자")) {
            if (height > 157) {
                aver = "평균 초과";
            } else if (height < 157) {
                aver = "평균 미만";
            }
            System.out.printf("%dcm는 %s 키 %s입니다.", height, gender, aver);
        }
    }
}