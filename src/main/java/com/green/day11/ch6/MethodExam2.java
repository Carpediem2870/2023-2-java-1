package com.green.day11.ch6;

import com.green.day4.ch4.Switch;

public class MethodExam2 {

    String scoreResultOpt(int n) {
        if (n < 0 || n > 100) {
            return "점수를 확인해 주세요";
        }
        String grade = "C";
        if (n == 100) {
            return "A+학점";
        } else if (n < 70) {
            return "D학점";
        } else if (n >= 90) {
            grade = "A";
        } else if (n >= 80) {
            grade = "B";
        }
        String opt = "";
        int modVal = n % 10;
        if(modVal >= 8) {
            opt = "+";
        } else if (modVal <= 3) {
            opt = "-";
        }
        return grade + opt;
    }


    String getSeason(int n2) {

        switch (n2) {
            case 3, 4, 5:
                return "봄";
            case 6, 7, 8:
                return "여름";
            case 9, 10, 11:
                return "가을";
            case 12, 1, 2:
                return "겨울";
        }
        return "없음";
    }
}






















//        String sss = "";
//        switch(n2) {
//            case 3, 4, 5:
//                return "봄";
//            case 6, 7, 8:
//                return "여름";
//            case 9, 10, 11:
//                return "가을";
//            case 12, 1, 2:
//                return "겨울";
//        }
//        return sss;
//    }

