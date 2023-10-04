package com.green.연습용._1;

import java.util.Scanner;

public class t0000 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("전화번호를 입력해주세요 (010-1235-5678 하이픈 포함) ");


        //소문자를 대문자로변환
        // str = "sadfsdafasdf";
        // String str3 = str.toUpperCase();  << 비파계 : 원본str은 그대로 유지하면서 새로 생성한 str3에 원본을 변형해서 사용
        // System.out.println("str : " + str);
        // System.out.println("str3 : " + str3);


        String pNum = scan.nextLine();
        char fNum = (char)pNum.charAt(11);
        String space = "B";
        int num = Character.getNumericValue(fNum);


        if (num <=5){
            space = "A";



        } else if (num > 5) {
        }
        System.out.printf("%s공간에서 대기해주세요.", space);
    }
}


// 삼항 연산자로 더욱 간략화한 내용
//        Scanner scan = new Scanner(System.in);
//        System.out.println("전화번호를 입력해주세요 (010-1235-5678 하이픈 포함) ");
//
//        String pNum = scan.nextLine();
//        char fNum = pNum.charAt(2);
//        String space = (fNum <= '5') ? "A" : "B";
//
//        System.out.printf("%s공간에서 대기해주세요.", space);
//    }
//}