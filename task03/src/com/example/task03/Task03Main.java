package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(5, 3);
        ComplexNumber num2 = new ComplexNumber(2, 3);

        System.out.println("Первое комплексное число: " + num1);
        System.out.println("Второе комплексное число: " + num2);

        ComplexNumber sum = num1.add(num2);
        System.out.println("Сумма: " + sum);

        ComplexNumber product = num1.multiply(num2);
        System.out.println("Произведение: " + product);
    }
}
