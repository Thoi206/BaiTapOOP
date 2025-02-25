package Bai1_8;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        setTime(hour, minute, second);
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        if(hour >= 0 && hour < 24){
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if(minute >= 0 && minute < 60){
            this.minute = minute;
        }
    }
    public void setSecond(int second) {
        if(second >= 0 && second < 60){
            this.second = second;
        }
    }
    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }else {
            throw new IllegalArgumentException("Invalid time input");
        }


    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public Time nextSecond(){
        int newHour = this.hour;
        int newMinute = this.minute;
        int newSecond = this.second +1;
        if (newSecond ==60){
            newSecond = 0;
            newMinute++;
            if(newMinute == 60){
                newMinute = 0;
                newHour++;
                if(newHour == 24){
                    newHour = 0;
                }
            }

        }
        return new Time(newHour, newMinute, newSecond);
    }
    public Time previousSecond(){
        int newHour = this.hour;
        int newMinute = this.minute;
        int newSecond = this.second -1;
        if (newSecond ==-1){
            newSecond = 59;
            newMinute--;
            if(newMinute == -1){
                newMinute = 59;
                newHour--;
                if(newHour == -1){
                    newHour = 23;

                }
            }
        }
        return new Time(newHour, newMinute, newSecond);
    }
}
