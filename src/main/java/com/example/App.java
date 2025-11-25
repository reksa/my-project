package com.example;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Maven Project!");
    }

    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("/ by zero");
        return a / b;
    }

    // String utilities
    public String reverse(String input) {
        if (input == null) throw new NullPointerException("Input is null");
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isEmpty(String input) {
        return input == null || input.isEmpty();
    }

    // List utility
    public int sumList(List<Integer> numbers) {
        if (numbers == null) return 0;
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Check even/odd
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}