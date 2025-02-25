package Bai3_5;

public class Main {
    public static void main(String[] args) {

        MyDate date = new MyDate(2024, 2, 28);
        System.out.println("Initial date: " + date);

        date.nextDay();
        System.out.println("After nextDay (Leap year - should be 29 Feb): " + date);

        date.nextDay();
        System.out.println("After another nextDay (Should be 1 Mar): " + date);

        date.previousDay();
        System.out.println("After previousDay (Should return to 29 Feb): " + date);

        date.nextMonth();
        System.out.println("After nextMonth: " + date);

        date.previousMonth();
        System.out.println("After previousMonth: " + date);

        date.nextYear();
        System.out.println("After nextYear: " + date);

        date.previousYear();
        System.out.println("After previousYear: " + date);

        date.setDate(2023, 12, 31);
        System.out.println("Set date to 31 Dec 2023: " + date);
        date.nextDay();
        System.out.println("After nextDay (Should be 1 Jan 2024): " + date);

        date.previousDay();
        System.out.println("After previousDay (Should be 31 Dec 2023): " + date);
        try {
            date.setDate(2024, 2, 30);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception for invalid date: " + e.getMessage());
        }

        date.setDate(2025, 2, 22);
        System.out.println("Day of the week for 22 Feb 2025: " + date);
    }
}