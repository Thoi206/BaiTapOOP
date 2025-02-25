package Bai3_4;

public class Main {
    public static void main(String[] args) {

        MyTime time = new MyTime(23, 59, 58);
        System.out.println("Initial time: " + time);

        time.nextSecond();
        System.out.println("After nextSecond: " + time);
        time.nextSecond();
        System.out.println("After another nextSecond (should reset to 00:00:00): " + time);

        time.nextMinute();
        System.out.println("After nextMinute: " + time);

        time.nextHour();
        System.out.println("After nextHour: " + time);
        time.previousSecond();
        System.out.println("After previousSecond: " + time);

        time.previousMinute();
        System.out.println("After previousMinute: " + time);

        time.previousHour();
        System.out.println("After previousHour: " + time);

        time.setTime(12, 30, 45);
        System.out.println("Time after setTime(12, 30, 45): " + time);
    }
}