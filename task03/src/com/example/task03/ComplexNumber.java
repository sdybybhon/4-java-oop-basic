package com.example.task03;

public class ComplexNumber {
    private double realPart;      // действительная часть
    private double imaginaryPart; // vнимая часть


    public ComplexNumber(double real, double imaginary) {
        this.realPart = real;
        this.imaginaryPart = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.realPart + other.realPart;
        double newImaginary = this.imaginaryPart + other.imaginaryPart;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = (this.realPart * other.realPart) - (this.imaginaryPart * other.imaginaryPart);
        double newImaginary = (this.realPart * other.imaginaryPart) + (this.imaginaryPart * other.realPart);
        return new ComplexNumber(newReal, newImaginary);
    }

    public String toString() {
        return String.format("%.2f + %.2fi", realPart, imaginaryPart);
    }
}
