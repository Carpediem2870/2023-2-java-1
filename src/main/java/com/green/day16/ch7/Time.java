package com.green.day16.ch7;

public class Time {
    public final static int MIN_HOUR = 0;
    public final static int MAX_HOUR = 23;

    private int hour, minute, second;

    // 1. 생성자를 통해서  값을 넣는 방법
//    Time(){
//
//    }
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {

//        String strHour = String.valueOf(hour<10 ? "0"+hour : hour);
        return String.format("%02d:%02d:%02d",hour,minute,second);

//        return String.format("%02d:%02d:%02d",hour,minute,second);
//        return hour + "시" + minute + "분" + second + "초";
    }


    // 2. setter 메소드   인스턴스값 각각 넣어야한다.

    public void setHour (final int hour){

        if (hour < MIN_HOUR) {
            this.hour = MIN_HOUR;
            return;
        }
        if (hour > MIN_HOUR) {
            this.hour = MAX_HOUR;
            return;
        }

        this.hour = hour;
        return; // 리턴 생략가능
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond(){
        return this.minute;
    }
}



class TimeTest{
    public static void main(String[] args) {
        Time time = new Time(12,20,30);
        time.setMinute(1);

        time.setHour(2);

        System.out.println(time); // 00:30:30
        // time.hour = 10;    위의 클래스에서 private 써서 값을 빼지 못함.

    }
}