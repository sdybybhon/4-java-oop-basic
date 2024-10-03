package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Line line = new Line(point1, point2);

        System.out.println(line);

        Point collinearPoint = new Point(5, 6);
        System.out.println("Точка" + collinearPoint + " коллинеарна с линией: " + line.isCollinearLine(collinearPoint));

        // (x2 - x1) * (y - y1) = (y2 - y1) * (x - x1)
        // (3−1) * (6−2) = (4−2) * (5−1)
        // 2 * 4 = 2 * 4
    }
}