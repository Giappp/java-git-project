package oop3;

public class App1 {
    public static void main(String[] args) {
        int num1 = InputUtils.getInteger("Number 1: ");
        int num2 = InputUtils.getInteger("Number 2: ");
        try {
            int result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero");
        }
    }
}
