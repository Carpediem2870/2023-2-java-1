package com.green.day10.ch5;

import java.util.Scanner;

public class MultiArrEx4_T향상For {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"}
                , {"computer", "컴퓨터"}
                , {"integer", "정수"}
        };
        // Q1. chair의 뜻은? >> dmlwk
        // 틀렸습니다. 정답은 의자입니다.

        Scanner scan = new Scanner(System.in);
        //  for (int i = 0; i < words.length; i++) {
//          String[] wordArr = words[i];
//          System.out.println(words[i][0] + "의 뜻은? >>");
//          String answer = scan.nextLine();
//          String expectedAnswer = wordArr[1];
        for (String[] wordArr : words) {
            System.out.print(wordArr[0] + "의 뜻은? >> ");
            String answer = scan.nextLine();
            String expectedAnswer = wordArr[1];

            if (!answer.equals(expectedAnswer)) {
                System.out.printf("오답입니다. 정답은 %s입니다.\n", expectedAnswer);
                continue;
            }
            System.out.println("정답입니다.");
        }


//
//            if (!answer.equals(expectedAnswer)) {
//                System.out.printf("오답입니다. 정답은 %s입니다.\n", expectedAnswer);
//                continue;
//            }
//            System.out.println("정답입니다.");
//        }
    }
}