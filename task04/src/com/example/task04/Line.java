package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return "Линия от " + p1 + " до " + p2;
    }

    public boolean isCollinearLine(Point p) {
        // если юудут равны, то точка p лежит на прямой, проходящей через p1 и p2.
        return (p2.getY() - p1.getY()) * (p.getX() - p2.getX()) == (p.getY() - p2.getY()) * (p2.getX() - p1.getX());
    }
}