package loop;

import utils.InputUtility;

/*
    Viết chương trình kiểm tra số chẵn/lẻ, chia hết cho 3 hay không.
*/
public class Ex3 {

    public static void main(String[] args) {
        int number = InputUtility.getInteger("Input number: ");
        switch (number % 2) {
            case 1: {
                System.out.println("Số lẻ");
                break;
            }
            case 0: {
                System.out.println("Số chẵn");
            }
        }
        if (isDivisibleByThree(number)) {
            System.out.println("Chia hết cho 3");
        } else {
            System.out.println("Không chia hết cho 3");
        }
    }

    public static boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }
}