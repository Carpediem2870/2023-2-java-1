package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17MissionForx3삼항연습 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력하세요> ");
        int num = scanner.nextInt();

        for (int i=1; i <= num; i++) {

            for (int z=num-i; z>0 ; z--) {
                System.out.print("_");
            }
            for (int z=0; z < i; z++) {
                System.out.print("*");
            }
           // String ddd = sss.equals("테란") ? "마린." : (sss.equals("저그") ? "저글링." : (sss.equals("프로토스") ? "질럿" : "랜덤"));
            
            System.out.println();
        }
    }
}