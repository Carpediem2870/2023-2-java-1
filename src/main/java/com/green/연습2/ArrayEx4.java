package com.green.연습2;

public class ArrayEx4 {
    public static void main(String[] args) {
        char[]abc = {'A','B','C','D'};
        char[]num = {'1','2','3','4','5','6','7','8','9'};
        char[] result = new char[abc.length+num.length];

        System.out.println(abc);
        System.out.println(num);

        System.arraycopy(abc,0,result,0,abc.length);
        System.arraycopy(num,0,result, abc.length, num.length);
        System.out.println(result);

    }
}
