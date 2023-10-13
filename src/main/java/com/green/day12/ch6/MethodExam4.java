package com.green.day12.ch6;

import com.green.day10.ch6.MethodExam;

import java.util.Arrays;

public class MethodExam4 {

    int[] plusMap(int[] a1, int num) {

        int[] tmp = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            tmp[i] = a1[i]+num; // + num으로 짧아짐 아래 tmp[i] += num; 생략가능
//            tmp[i] += num;
        }
        return tmp;
    }
////////////////////////////////////////////////////////////////////////////////////////////
    void plusOrigin(int[] a2, int num2) {

        for (int i = 0; i < a2.length; i++) {
            a2[i] += num2;
        }
    }

    int[] randomValFromTo(int aaa, int min, int max) {
        int[] tmp = new int[aaa];
        int ran = 0;

        for (int i = 0; i < tmp.length; i++) {
            ran = (int)(Math.random()*(max-min+1))+min;
            tmp[i] = ran;
            }
        return tmp;
    }

//    int[] randomValFromTo(int len, int min, int max) {
//        int[] tmpArr = new int[len];
//        MethodExam me = new MethodExam();
//        for(int i=0; i<tmpArr.length; i++) {
//            tmpArr[i] = me.randomValFromTo(min, max);
//        }
//        return tmpArr;
//    }
//    public static void main(String[] args) {
//        MethodExam4 me4 = new MethodExam4();
//
//        int[] arr = {10, 20, 30};
//        int[] rArr1 = me4.plusMap(arr, 2);
//
//        System.out.println(Arrays.toString(arr)); // [10, 20, 30]
//        System.out.println(Arrays.toString(rArr1)); // [12, 22, 32]
//
//        me4.plusOrigin(arr, 4);
//        System.out.println(Arrays.toString(arr));
//
//
//        int [] rArr2 = me4.randomValFromTo(10, 5, 20);   //(배열크기, min, max) 중복허용
//        System.out.println(Arrays.toString(rArr2));
//    }
}
//
