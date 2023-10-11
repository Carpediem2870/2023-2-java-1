package com.green.day9.ch5;

import java.sql.SQLOutput;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[]names = { "Kim", "Park", "Yi" };

        for (int i = 0; i < names.length; i++) {
            System.out.printf("names[%d]: %s\n", i, names[i]);

        }
        System.out.println();
/*
        String s3 = "woo";
        names[2] = s3;
        System.out.println(names[2]);
*/


        int z = 0;
        for (String str : names) {  // 향상된 for문 = for each문으로 인덱스 사용하려면 souf로 출력
            System.out.print(">"+str+"<  ");
            System.out.printf("names[%d]: %s\n",z++, str);
        }
        System.out.println("=======바로 위 for문과 같은 문장======");
        for (int i = 0; i < names.length; i++) {
            String str = names[i];
            System.out.println(str);
        }
    }
}
