package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(50, 30, 50);
        System.out.println(time);

        time.subtract(new TimeSpan(1, 40, 30));
        System.out.println(time);
    }
}
