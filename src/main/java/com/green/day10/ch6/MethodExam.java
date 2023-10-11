package com.green.day10.ch6;

public class MethodExam {
    void checkZero(int n) {

            System.out.println(n == 0 ? "0입니다." : "0이 아닙니다.");

        }

        void checkZero2(int n) {

        if(n == 0) {
            System.out.println("0입니다.");
            return;
        }
            System.out.println("0이 아닙니다.");
        }

        int randomValFromto (int from, int to) {
        int r = (int)(Math.random() * (to-from+1))+from;
                return r;


        }
        void scoreResultPrint(int n) {


//            System.out.println(n > 100|| n<0 ? "잘못된 점수입니다" : n >= 90 ? grade = "A" : n >= 80 ? grade = "B" : n >= 70 ? grade = "C" : "D");
        if (n > 100 || n < 0) {
            System.out.println("잘못된 점수입니다.");
            return;
        }
            String grade = "D";
        if (n >= 90) {
            grade = "A";
        } else if (n >= 80) {
            grade = "B";
        } else if (n >= 70) {
            grade = "C";
        }
            System.out.printf("%s학점\n", grade);
        }
    }

