package com.green.day19.ch7.starcraft;

import com.green.day18.ch7.MyArrayList;

import java.util.ArrayList;
import java.util.List;

class StarcraftGame {
    public static void main(String[] args) {

        Unit unit = new Marine();
        unit.move(10,20);
        Unit unit2 = new Tank();
        unit2.move(10,20);
        unit2.changeMode();
        unit.steamPack();

        List<Unit> units = new ArrayList();
        units.add(unit);
        units.add(unit2);

        // 배열, arrayList 사용하면 여러개를 담을 수 있음.
    }
}
class SrarcraftGame2 {
    public static void main(String[] args) {
        List<Unit> units = new ArrayList();

        units.add(new Marine());
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Tank());
        units.add(new Tank());

        moveAll(units, 30, 50);

        Unit unit1 = units.get(units.size()-1);


    }

    private static void moveAll(List<Unit> units, int x, int y) {

        for (int i = 0; i < units.size(); i++) {

//            Unit unit = units.get(i);
//            unit.move(x,y);
            units.get(i).move(x,y);
        }
//        for (Unit unit : units) {
//            unit.move(x,y);
//        }
    }
}
//추상메소드 : 구현부가 없는 메소드
public abstract class Unit {


    protected Unit units;
    protected int x;
    protected int y;

    public abstract void move (int x, int y);
    public void stop() {
        System.out.println("현재 위치에서 정지");
    }


    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void changeMode() {
    }

    public void steamPack() {

    }
}


class Marine extends Unit {


    @Override
    public void move(int x, int y){

        this.x = x;
        this.y = y;

//        setX(x);
//        setY(y);

        System.out.printf("마린이 좌표 x:%d, y:%d로 이동\n", x, y);
    }

    public void steamPack(){
        System.out.println("스팀팩 시전!!!");
    }

}

class Tank extends Unit {


    private boolean siegeMode;
    @Override
    public void move(int x, int y) {


        this.x = x;
        this.y = y;

        System.out.printf("탱크가 좌표 x:%d, y:%d로 이동\n", x, y);

    }
    // siegeMode = false는 시즈모드가 아님.
    // 이 상태에서 changeMode메소드가 호출이 되면 > 시즈모드가 되어야함
    // siegeMode = true; 들어가야하고 콘솔에는 "시즈모드가 되었습니다."

    // siegeMode = true;는 시즈모드가 된거다.
    // 이 상태에서 changeMode메소드가 호출 되면 > 시즈모드가 풀려야 한다.
    // sigeMode = false 가 들어가야되고 콘솔에는 "시즈모드가 풀렸습니다."
    public void changeMode() {

        siegeMode = !siegeMode;
        System.out.println(siegeMode ? "시즈모드가 되었습니다." : "시즈모드가 풀렸습니다.");

//        if (siegeMode) {
//            System.out.println("시즈모드가 되었습니다.");
//        } else {
//            System.out.println("시즈모드가 풀렸습니다.");

        }

    }
