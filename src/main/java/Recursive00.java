package src.main.java;

public class Recursive00 {

    public static long factorial(long n) {
        System.out.printf("n = %d\n", n);
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.printf("n! = %d\n", factorial(5));
        System.out.printf("n! = %d\n", factorial(20));
    }
}
