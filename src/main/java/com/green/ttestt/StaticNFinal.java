package com.green.ttestt;


public class StaticNFinal {

    String color23;
    String gearType23;
    int door23;


    public StaticNFinal() {
        this("black");
    }

    public StaticNFinal(String color){
        this(color,"auto",4);
    }
    public StaticNFinal (String color, String gearType, int door){
        this.color23 = color;
        this.gearType23 = gearType;
        this.door23 = door;
    }

    void printSelff() {
        System.out.printf("%s %s %d\n",color23,gearType23,door23);
    }

}
    class CarrrTest {
        public static void main(String[] args) {

            StaticNFinal car1 = new StaticNFinal();
            StaticNFinal car2 = new StaticNFinal("red");

            car1.printSelff();
            car2.printSelff();
        }
    }