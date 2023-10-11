package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7응용_T {
    public static void main(String[] args) {
        //1. 정수 10개를 저장할 수 있는 배열을 만든다.
        //2. 0~9 값을 순차적으로 대입한다
        //3. 셔플

        int[] aaa = new int[10];

        for (int i = 0; i < aaa.length; i++) {
            aaa[i] = i;
        }
        System.out.println(Arrays.toString(aaa));

        for (int i = 0; i < aaa.length; i++) {  // 셔플구간
            //0~9
            int rIdx = (int)(Math.random() * aaa.length);
            if (i == rIdx) { continue;}
                int tmp = aaa[i]; // 0으로 채워진 aaa[i]길이만큼 tmp에 배열생성
                aaa[i] = aaa[rIdx];  // rIdx에 있는 값을 aaa [i] 에 초기화한다.
                aaa[rIdx] = tmp;
            }
        System.out.println(Arrays.toString(aaa));
        }
    }

