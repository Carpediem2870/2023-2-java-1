package com.green.day2.ch2;

public class CastingEx1 {
    public static void main(String[] args) {
        // 타입을 맞춰야 함
        double d = 85.4;
        int score = (int)d; // 강제 형 변환 = Casting
        System.out.println("score : " + score); // 실수인 소수점부분이 날아감 // 반대로 정수는 실수로 저장할 수 있음
        System.out.println("d : " + d);

        byte b1 = 127;
        short s1 = b1; // 같은 정수구간이고 범위가 short 가 더 넓기 때문에 형변환 필요없음
        int i1 = s1; // 같은 정수구간이고 범위가 int 가 더 넓기 때문에 형변환 필요없음
//        byte q1 = i1; 범위가 더 낮아져서 불가능한거같음??

        float f1 = i1;
//        int i2 = f1; 이때는 강제로 f1앞에 (int)를 넣어 형변환 해야함

    }
}
