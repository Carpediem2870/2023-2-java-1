package com.green.day16.ch7;

class AnimalTest {
    public static void main(String[] args) {
        //1. 부모타입은 자식 객체 주소값 담을 수 있다.
    //  타입 객주 = 불러온 객주값을 대입한다.
        Dog d1 = new Bulldog();
        Animal ani1 = d1;
        Bulldog bull = (Bulldog)ani1;
//        Animal ani1 = new Bulldog();
        Animal ani2 = new Dog();
        Animal ani3 = new Cat();

        //2. 자식타입은 부모 객체 주소값 담을 수 없다.
        //Bulldog bull1 = new Dog();  도그가 부모타입이기 때문에 불가능
        Dog d2 = new Dog();
        //Bulldog bull2 = (Bulldog)d2;  d2가 도그타입의 주소값 즉 부모타입의 주소값 이기 때문에 불가능
        Animal ani4 = d2;
        System.out.println("끝");

        //3. 타입은 알고 있는 메소드만 호출할 수 있고
        // , 호출이 된다면 객체 기준이다.
        Bulldog bull3 = new Bulldog();
        bull3.jump();
        bull3.crying();

        Dog dog2 = new Bulldog();
        dog2.jump();
        dog2.crying();

    }
}

class AnimalTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bulldog bulldog = new Bulldog();

        System.out.println(bulldog instanceof Dog); // 아래 내용처럼 도그타입의 불도그타입으로 형변환 가능한지 확인 true 뜸
        Dog dog2 = bulldog;

        System.out.println(bulldog instanceof Bulldog);
        Bulldog bulldog2 = bulldog;

        System.out.println(bulldog instanceof Animal);
        Animal ani = bulldog;

        System.out.println(ani instanceof Cat);
//        Cat cat2 = (Cat)ani;  작은타입을 큰타입을 불러오면 에러 터진다.

        System.out.println("---------구분선1---------");
        callCrying(dog);
        System.out.println("---------구분선2---------");
        callCrying(cat);
        System.out.println("---------구분선3---------");
        callCrying(bulldog);
        System.out.println("---------구분선4---------");
        }

        private static void callCrying(Animal ani){
            ani.crying();
            if (ani instanceof Bulldog) {     // 왼쪽에 변수, 오른쪽에 클래스명 넣어서 true면 형변환된다 false면 형변환 안된다
                Bulldog bulldog = (Bulldog)ani;
                bulldog.jump();
            }

        }


//    private static void callCrying(Dog dog) {
//        dog.crying();
//    }
//    private static void callCrying(Cat cat) {
//        cat.crying();
//    }
//    private static void callCrying(Bulldog bulldog) {
//        bulldog.crying();
//    }
}

class AnimalTest3 {
    public static void main(String[] args) {
        Animal ani = new Cat();
        System.out.println(ani instanceof Dog);
//        Dog dog = (Dog)ani;  에러
        System.out.println(ani instanceof Cat);
        Cat cat = (Cat)ani;
        System.out.println("===끝===");


    }
}
public class Animal {
    public void crying() {
        System.out.println("동물이 운다.");
    }
}

class Dog extends Animal {
    public void jump() {
        System.out.println("점프! 점프!");
    }
    @Override
    public void crying() {
        System.out.println("멍! 멍!");
    }
}

class Bulldog extends Dog {
    @Override
    public void jump() {
        System.out.println("불독이 점프! 점프!");
    }

    @Override
    public void crying() {
        System.out.println("불독이 왈! 왈!");
    }
}

class Cat extends Animal {
    @Override
    public void crying() {
        System.out.println("야옹~ 야옹~");
    }
}