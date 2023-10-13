package com.green.day11.ch6;

public class MethodExam2Test {
    public static void main(String[] args) {

        MethodExam2 me2 = new MethodExam2();

        String r1 = me2.scoreResultOpt(95);
        System.out.printf("r1 : %s학점", r1);


        System.out.println();
        System.out.println("------------------");


        // 100초과 0미만은 "점수를 확인해 주세요" 값이 리턴
        // 90이상 A학점 8점이상 +, 3점이하 -, 나머지 0
        // 80이상 B학점 8점이상 +, 3점이하 -, 나머지 0
        // 70이상 C학점 8점이상 +, 3점이하 -, 나머지 0
        // D학점 (+-없음)

        String season = me2.getSeason(12);
        System.out.println(season);

        // 3, 4, 5 >> 봄
        // 6, 7, 8 >> 여름
        // 9, 10, 11 >> 가을
        // 12, 1, 2 >> 겨울
        // 나머지 >> 없음

    }
}
