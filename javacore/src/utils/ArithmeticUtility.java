package utils;

/*
    Class hỗ trợ tính toán với các số nguyên
 */
public class ArithmeticUtility {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int diff(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return (double) a / b;
    }
}
