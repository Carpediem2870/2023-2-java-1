package com.green.day10.ch5;

import com.green.day4.ch4.For;

import java.util.Scanner;

public class MultiArrEx4_2 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"}
                , {"computer", "컴퓨터"}
                , {"integer", "정수"}
        };
        // Q1. chair의 뜻은? >> dmlwk
        // 틀렸습니다. 정답은 의자입니다.

        Scanner scan = new Scanner(System.in);

        int [][] sum = { };

        int a = 0, b = 0;

        for (String [] ddd : words) {
            System.out.println("Q"+(1)+". " + words[a][0] + "의 뜻은? >>");
            String mm = scan.nextLine();

            if (mm.equals(ddd)) {
                System.out.println("정답입니다.");
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다\n", words[a][1]);
            }
            a = a+1;
        }
    }
}