package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        normalizeTime();
    }

    private void normalizeTime() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
    }

    public void add(TimeSpan time) {
        seconds += time.getSeconds();
        minutes += time.getMinutes();
        hours += time.getHours();
        normalizeTime();
    }

    public void subtract(TimeSpan time) {
        seconds -= time.getSeconds();
        minutes -= time.getMinutes();
        hours -= time.getHours();

        if (this.seconds < 0) {
            this.minutes -= 1;
            this.seconds += 60;
        }

        if (this.minutes < 0) {
            this.hours -= 1;
            this.minutes += 60;
        }

        normalizeTime();
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        normalizeTime();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        normalizeTime();
    }
}
