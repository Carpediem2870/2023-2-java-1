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

        for (int i = 0; i < aaa.length; i++) {
            //0~9

            int rIdx = (int)(Math.random() * aaa.length);
            if (i == rIdx) { continue;}
                int tmp = aaa[i];
                aaa[i] = aaa[rIdx];
                aaa[rIdx] = tmp;
            }
        System.out.println(Arrays.toString(aaa));
        }
    }

