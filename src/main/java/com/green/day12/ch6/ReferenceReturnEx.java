package com.green.day12.ch6;

class Data5 {
    int x;
    double d;
}
public class ReferenceReturnEx {
    public static void main(String[] args) {

        Data5 d = new Data5();

        d.x = 10;
        d.d = 100.5;

        Data5 d2 = copyObj(d);
        System.out.println("d == d2 : " + (d == d2)); // false
        System.out.println("d.x == d2.x : " + (d.x == d2.x)); // true
        System.out.printf("d.d == d2.d : " + (d.d == d2.d)); // true

    }

    public static Data5 copyObj(Data5 obj) {

        Data5 tmp = new Data5();
        tmp.x = obj.x;
        tmp.d = obj.d;
        return tmp;

//        d2.x = obj.x;
//        d2.d = obj.d;

    }
}