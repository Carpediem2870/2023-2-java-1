package com.green.day17.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Computer c = new Computer();
        int price = c.getPrice();
        int bonusPoint = c.getBonusPoint();

    }
}

class PolyArgumentTest2{
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        System.out.println(buyer); // money: 1000, bonusPoint: 0
        buyer.buy(new Tv()); // Tv 가격
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        System.out.printf("현재 %s, \n",buyer); // money: 750, bonusPoint: 30

        // 10개짜리 프로덕트 배열을 갖고 있는 buyer를 만든다.

        // buyer money가 부족하면 "잔액 부족" money값은 마이너스처리되면 안됨
        // 잔액이 부족하지 않으면 Tv을/를 구입하셨습니다.
        // > money 차감, 보너스포인트 증감
    }
}

class Buyer {
    private int money;
    private int bonusPoint;



    public void buy(Product product) {
        if (money < product.getPrice()){
            System.out.println("잔돈부족");
            return;
        }
        else
            money -= (product.getPrice());
        bonusPoint = bonusPoint + product.getBonusPoint();
        System.out.printf ("%s을/를 구매하셨습니다. -%d원차감, 보너스+%d증감\n",product,product.getPrice(),product.getBonusPoint());



//        System.out.printf("제품명: %s, ", product);
//        System.out.printf("price: %d, " ,product.getPrice());
//        System.out.printf("BonusPoint: %d\n" ,product.getBonusPoint());

    }

//    public void buy(Computer c) {
//        System.out.println("Computer price: " + c.getPrice());
//    }

    protected Buyer(){
        this.money = 1050;
        this.bonusPoint = 0;
    }

    @Override
    public String toString(){
        return String.format("money: %d, bonusPoint: %d",money, bonusPoint);
    }
}


class Product {
    private int price;
    private int bonusPoint;
    private String Computer;



    protected Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(price * 0.1);
    }

    public int getPrice() {
        return this.price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }



    public String toString() {
        return String.format("%s, Price: %d, bonusPoint: %d",Computer, price, bonusPoint);
    }



}

class Computer extends Product {
    public Computer() {
        super(200);
    }

    @Override
    public String toString(){
        return "Computer";
    }
}


class Tv extends Product {
    public Tv() {
        super(100);
    }

    @Override
    public String toString(){
        return "Tv";
    }
}