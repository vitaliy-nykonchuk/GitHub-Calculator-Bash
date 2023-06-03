package _01_initial_commit.app;

public class Main {

    public static void main(String[] args) {
        int a = 80;
        int b = 20;
        int c = add(a, b);
        System.out.println(c);
        System.out.println("Hello, world!");
    }

    private static int add(int a, int b) {
        return a + b;
    }
}