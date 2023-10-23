package com.green.day16.ch7;

public class Singleton {

    private Singleton() {

    }

    private static Singleton singleton;
    public static Singleton getInstance(){

        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;

    }

}

class StingletonTest {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance(); // 스태틱메소드 호출
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        //Singleton s1 = new Singleton();
    }
}

class dk1 {
    int num2 = 2;

    int sum2 = 0;
    public static void main(String[] args) {
        dk2 zz = new dk2();
        zz.sum2 = zz.sum2 + zz.num2;
        System.out.println(zz.num2);
    }



}

class dk2 extends dk1{
int num2;
    dk2(){
        super.num2 = 5;
    }

}

class dk3 extends dk2 {
    int num2;
    dk3(){
        super.num2 = 5;
    }
}
