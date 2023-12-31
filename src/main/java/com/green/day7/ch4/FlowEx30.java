package com.green.day7.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        //반복문 사용

        int sum = 0;
        int i = 0;
        final int TARGET = 100; // TARGET 매직넘버
        // i 값이 계속 증가가되면 sum에 중첩으로 더하기
        // sum값이 100초과가 되는 시점의 i값

        while (sum < TARGET) { // TARGET 매직넘버
            sum += ++i;
            System.out.printf("%d+%d = %d\n", sum,i,sum);
        }
        System.out.println("100초과된 i값 = "+i);
    }
}