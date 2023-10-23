package com.green.day15.ch7;

import javax.crypto.Cipher;

public class Parent {

    int age;

    public Parent(){

    }

}

class Child extends Parent {

    public Child(){
        super();

    }

    void play(){
        System.out.printf("나는 %d살이야 놀자\n",age);
    }
}

class Child2 extends Parent {
        void jump() {
        System.out.printf("%d살의 아이가 점프를 하였다.",age);
    }
}
class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.age = 10;
        c1.play();

        Child2 c2 = new Child2();
        c2.age = 7;
        c2.jump();
    }
}
