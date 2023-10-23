package com.green.day17.ch7;

public class PolyArgumentTestVer2 {
    public static void main(String[] args) {
        Product2 p = new Product2("제품명", 1000);
        System.out.println(p);
    }
}

class PolyArgumentTestVer2_2 {
    public static void main(String[] args) {
        Tv2 tv2 = new Tv2();
        System.out.println(tv2); // name: Tv, price: 100, bonusPoint: 10
        Computer2 com = new Computer2();
        System.out.println(com); // name: Tv, price: 200, bonusPoint: 20
        Audio2 audio = new Audio2();
        System.out.println(audio); // name: Tv, price: 500, bonusPoint: 50
    }
}

class PolyArgumentTestVer2_3 {
    public static void main(String[] args) {
        Buyer2 buyer2 = new Buyer2();

        buyer2.buy(new Tv2()); // 1000 - 100 = 900
        buyer2.buy(new Computer2()); // 900 - 200 = 700
        buyer2.buy(new Tv2()); // 800 - 100 = 700
        buyer2.buy(new Computer2()); // 700 - 200 = 500
        buyer2.buy(new Computer2()); // 500 - 200 = 300
        buyer2.buy(new Computer2()); // 300 - 200 = 100
        buyer2.buy(new Computer2());
        buyer2.buy(new Computer2());
        buyer2.buy(new Computer2());
        buyer2.buy(new Tv2());
//        ============ 10개 초과 시점 =============
        System.out.println(buyer2);
        buyer2.summary(); // 총 구매금액 : 1000만원 900만원?

//        Product2[] arr = buyer2.productArr;
//        for (int i = 0; i < arr.length; i++) {
//            Product2 p = arr[i];
//            System.out.printf("arr[%d] : %s\n", i, p);
//        }
    }
}


// money(정수) 저장가능
// bonusPoint(정수) 저장가능
// Product2 객체의 주소값 여러개 저장 가능
class Buyer2 {


    public void summary() {
        System.out.printf("총금액: %d",sum);
    }
    private int money;
    private int bonusPoint;
    private Product2[] productArr;
    int i = 0;
    int sum = 0;

    int j;
    int k;
    int q;

    public String toString() {
        return String.format("컴퓨터구매: %d개, Tv구매: %d개, Audio구매: %d개 ", j, k, q);
    }

    public void buy(Product2 product2) {

        if (i == productArr.length) {
            System.out.println("[공간]이 부족합니다.");
            return;
        } else if (money < 0) {
            System.out.println("금액이 부족합니다.");
        } else





            System.out.printf("%s을(를) 구매했습니다.\n", product2.getName());
        money = money - product2.getPrice();
        bonusPoint = bonusPoint + product2.getBonusPoint();
        productArr[i++] = product2;

        sum+=product2.getPrice();
    }

    public Buyer2() {
        this.money = 1000;
        this.bonusPoint = 0;
        productArr = new Product2[10];
//
//        for (int l = 0; l < productArr.length; l++) {
//            if (productArr[l].getName().equals("Computer")) { j++; }
//            if (productArr[l].getName().equals("Tv")) { k++; }
//        }

    }
}

class Product2 {
    private String name;
    private int price;
    private int bonusPoint;

    public Product2(String name, int price) {
        this.name = name;
        this.price = price;
        this.bonusPoint = price / 10;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

@Override
    public String toString() {
        return String.format("제품명: %s, 가격: %d, 보너스포인트: %d", name, price, bonusPoint);
    }
}

class Tv2 extends Product2 {

    public Tv2() {
        super("Tv", 100);
    }

}

class Computer2 extends Product2 {

    public Computer2() {
        super("Computer", 200);
    }
}

class Audio2 extends Product2 {
    public Audio2() {
        super("Audio", 500);
    }
}

