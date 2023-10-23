package com.green.day14.ch6;

public class Data1 {

    int value;
    int value2;
    int value3;


//    public Data1() {}   파라미터가 없는 생성자가 기본 생성자
    public Data1() {
//        value = 100;
//        value2 = 200;
//        value3 = 300;
        this(200, 300, 400);

    } // 기본 생성자 생성조건 : 클래이스이름과 같아야하고, 리턴값이 없어야 한다.

    public Data1(int a) {
        value = a;
    }

    public Data1(int a, int b, int c) {
        value = a;
        value2 = b;
        value3 = c;
    }

    public void printMySelf() {

        System.out.printf("value: %d, vadue2: %d, value3: %d\n", value, value2, value3);
    }
}
class ConstructorTest {
    public static void main(String[] args) {
        Data1 d = new Data1();
        d.printMySelf();

        Data1 d2 = new Data1(10, 20, 30);
        d2.printMySelf();
    }
}
