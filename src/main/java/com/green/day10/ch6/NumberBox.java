package com.green.day10.ch6;

public class NumberBox {

    // void 는 값을 적지않고 return; 생략되어있다. 돌아가는 값은 적지 않는다.
//    int n;
    void sum(int n1, int n2) {  // void : 리턴타입 // sum 메소드명 // (int n1, int n2) 파라미터 = 매개변수
        // 2개이상의 경우 각각 int int 이런식으로 타입 다적어야 함
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
        return; // 이건 void 들어가면 자동생략됨
    }
    void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
        return; // 이건 void 들어가면 자동생략됨
    }

    void abs (int n1) {
        System.out.println(n1 > 0 ? n1*1 : -n1);
        return; // 이건 void 들어가면 자동생략됨
    }

}
