package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);

        PolygonalLine polygonalLine = new PolygonalLine();
        polygonalLine.addPoint(p1);
        polygonalLine.addPoint(p2);
        polygonalLine.addPoint(p3);

        // примерно 5.66


        System.out.println("Длина ломаной линии: " + polygonalLine.getLength());
    }
}
