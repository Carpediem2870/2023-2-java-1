package com.green.day12.ch6;

public class MethodExam3_T {

    int sumText2(String str) {
        char[] charArr = str.toCharArray(); // str.toCharArray(); 에는 char[] 캐릭터배열 char[0~99999999 와같은 숫자가들어감]
        int sum = 0;

        for (char ch : charArr) {
            sum += Character.getNumericValue(ch);
        }
        return sum;
    }
    public static void main(String[] args) {

        MethodExam3_T me3 = new MethodExam3_T();
        String test = "9871231";
        System.out.println("sum : " + test); // 12
        System.out.println("sum2 : " + me3.sumText2("111")); // 6
    }
}
