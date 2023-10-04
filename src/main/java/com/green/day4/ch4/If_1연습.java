package com.green.day4.ch4;

import java.util.Scanner;

public class If_1연습 {
    public static void main(String[] args) {
        // Scanner를 이용하여 성별을 입력 (남자, 여자)
        // 만약에 남자가 입력되었다면 콘솔에 "잘 생겼다." 출력
        // 만약에 여자가 입력되었다면 콘솔에 "예쁘다." 출력
        // 남자, 여자가 아닌 값이 입력되었다면 "누구냐." 출력

        Scanner scanner = new Scanner(System.in);
        System.out.println("종족 뭐할거야? (테란, 저그, 프로토스) >> ");
        String sss = scanner.nextLine();
        String ddd = sss.equals("테란") ? "마린." : (sss.equals("저그") ? "저글링." : (sss.equals("프로토스") ? "질럿" : "랜덤"));

        System.out.printf("%s\n", ddd);

        System.out.println(ddd);

    }
}
