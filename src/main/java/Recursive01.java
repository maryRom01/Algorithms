package src.main.java;

public class Recursive01 {

    private static long factTailRecursive(long n, long acc) {
        System.out.printf("n = %d\n", n);
        if (n <= 1) return acc;
        else return factTailRecursive(n - 1, acc * n);
    }

    public static long factTailRecursive(long n) {
        System.out.printf("n = %d\n", n);
        return factTailRecursive(n, 1);
    }

    public static void main(String[] args) {
        System.out.printf("n! = %d\n", factTailRecursive(5));
        System.out.printf("n! = %d\n", factTailRecursive(20));
    }
}
