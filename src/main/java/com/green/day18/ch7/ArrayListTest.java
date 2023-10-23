package com.green.day18.ch7;

import com.green.day12.ch6.Card;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();  // ArrayList의 내부는 배열이다.

        list.add(10);
        list.add(10.3f);
        list.add(10.4d);
        list.add(13L);
        list.add("ddd");
        list.add(new Card());

        Object val1 = list.get(0);
        int intVal = (int)val1;

        float floatVal = (float)list.get(1);


        Object obj = 10;
        obj = 10.3f;
        obj = 10.3d;
        obj = 103l;
        obj = "ddd";
        obj = new Card();

    }
}


class ArrayListTest2 {
    public static void main(String[] args) {
        int v1 = 10;
        Integer v2 = 10;
        System.out.println(v1 == v2);

        List<Integer> list = new ArrayList();  // <> 에는 레퍼타입만 들어갈 수 있음 페이지491쪽 참고
        list.add(10); // add 는 대입연산자가 아닌 추가. 리턴타입이 있음 boolean 타입
        // 이때 방은 0번방 1개만 생성됨. 1번방 출력하면 out of bound 에러 뜸.
        list.add(20);
        list.add(30);
        list.add(50);

        // list.add(10.3f);
        int val1 = list.get(0);
        System.out.println(list.get(1));
        System.out.println("size : " + list.size());
        System.out.println("=======================");

        // [0]: 10
        // [1]: 20
        // [2]: 30

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("[%d]: %d\n",i,list.get(i));

        }
        System.out.println("=======================");
        for (int val : list)
            System.out.println(val);
    }
}


class ArrayListTest3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        list.add(1,100);  // index방번호에 element 값을 넣는다. 기존1번방 부터는 2번방순으로 뒤로 밀려남
        System.out.println(list);
        list.add(3, 200);
        System.out.println(list);

        list.remove(0); // 0번방의 값을 지우고 나머지 배열주소를 한칸씩 땡긴다.
        System.out.println(list);
    }
}