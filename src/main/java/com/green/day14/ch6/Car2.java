package com.green.day14.ch6;

public class Car2 {
    String color;
    String gearType;
    int door;

    void printMyself() {
        System.out.printf("색상 = %s, 타입 = %s, 도어수 = %d\n",color,gearType,door);
    }

    Car2(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
        }
        //
        Car2(){
            color = "black";
            gearType = "manual";
            door = 5;
        }
        //
        Car2(Car2 d){
        this(d.color, d.gearType, d.door);
        }
    }


class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "White";
        c1.gearType = "auto";
        c1.door = 2;

        Car2 c2 = new Car2(c1);

        c1.printMyself(); // color = black, gearType = manual, door = 5;
        c2.printMyself(); // color = black, gearType = manual, door = 5;
    }
}
