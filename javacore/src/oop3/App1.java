package oop3;

import utils.InputUtility;

public class App1 {
    public static void main(String[] args) {
        int num1 = InputUtility.getInteger("Number 1: ");
        int num2 = InputUtility.getInteger("Number 2: ");
        try {
            int result = num1 / num2;
            System.out.println("Kết quả " + num1 + "/" + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Chia cho 0, phép tính không hợp lệ");
        }
    }
}
