package com.green.day11.ch6;

public class MethodExam3Test {
    public static void main(String[] args) {
        MethodExam3 me2 = new MethodExam3();
        String r1 = me2.scoreResultOpt(100);
        System.out.printf("r1 : %s", r1);


        // 100초과 0미만은 "점수를 확인해 주세요" 값이 리턴
        // 90이상 A학점 8점이상 +, 3점이하 -, 나머지 0
        // 80이상 B학점 8점이상 +, 3점이하 -, 나머지 0
        // 70이상 C학점 8점이상 +, 3점이하 -, 나머지 0
        // D학점 (+-없음)


    }
}
