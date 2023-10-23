package com.green.ttestt;

import com.green.day14.ch6.Car;

public class Car22 {
    int a;
    int b;
}

//    class Car33 extends Car22 {  // 상속
//        int c;
//}

class Car33{                   // 포함
    Car22 d = new Car22();
    int c;


}


class CarTest {
    public static void main(String[] args) {
         Car33 ppp = new Car33();


         // 포함관계 사용 시 호출
         ppp.d.a = 1;
         ppp.d.b = 2;
         ppp.c = 3;
        System.out.println(ppp.d.a);
        System.out.println(ppp.d.b);
        System.out.println(ppp.c);

        // 클래스간 상속관계일 경우
//        ppp.a = 1;
//        ppp.b = 2;
//        ppp.c = 3;
//        System.out.println(ppp.a);
//        System.out.println(ppp.b);
//        System.out.println(ppp.c);

    }
}