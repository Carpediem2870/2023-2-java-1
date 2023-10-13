package com.green.day11.ch6;

public class StarPrint {

    void line (int sss) {

        for (int i = 0; i < sss; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    void square (int bbb) {
        for (int i = 0; i < bbb; i++) {
            line(bbb);
        }
    }
    void triangle (int dd) {
        for (int i = 1; i <= dd; i++) {
            line(i);
        }
    }


//    String chkGenderById (String ff) {
//        char gender = ff.charAt(7);
//
//        switch (gender) {
//
//
//            case '2','4':
//                return "여자";
//            case '1','3':
//                return "남자";
//        }return "유효하지않은 주민번호";
//    }

    String chkGenderById (String ff) {
        char ch = ff.charAt(7);

        switch (ch) {
            case 2, '4' :
                return "여성";

            case '1', '3':
                return "남성";
        }
        return "유효하지 않은 주민번호22";
    }
    int sumFromTo (int n1, int n2) {
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += i;
        }
        return sum;
    }
}
