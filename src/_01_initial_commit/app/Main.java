package _01_initial_commit.app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        int a = 8;
        int b = 2;
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }
}