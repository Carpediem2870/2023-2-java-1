package com.green.day11.ch6;

public class MethodExam3 {


    String scoreResultOpt(int grade) {



/*        // Case1
        if (grade > 100 || grade < 0) {
            return "점수를 확인해 주세요";
        } else if (grade >= 90) {
            g = "A";
            if (grade >= 98) {
                p = "+";
            } else if (grade <= 93) p = "-";
        } else if (grade >= 80) {
            g = "B";

            if (grade >= 88) {
                p = "+";

            } else if (grade <= 83) {
                p = "-";
            }
        } else if (grade >= 70) {
            g = "C";
            if (grade >= 78) {
                p = "+";
            } else if (grade <= 73) {
                p = "-";
            }
        }
        return g + p + "학점";*/

        // Case2

        String g = "D";
        String p = "";

        if (grade > 100 || 0 > grade) {
            return "잘못입력했습니다";
        }
        if (grade >= 90) {
            g = "A";
        } else if (grade >= 80) {
            g = "B";
        } else if (grade >= 70) {
            g = "C";
        }
        if (grade % 10 >= 8 || grade == 100) {
            p = "+";
        } else if (grade % 10 <= 3) {
            p = "-";
        }
        return g + p + "학점";
    }
}