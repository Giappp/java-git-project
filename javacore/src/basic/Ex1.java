package basic;

/*
Đề Bài: Viết chương trình nhập 2 số nguyên, in ra tổng, hiệu, tích, thương.
*/

import utils.ArithmeticUtility;
import utils.InputUtility;

public class Ex1 {
    public static void main(String[] args) {
        int i1 = InputUtility.getInteger("Number 1: ");
        int i2 = InputUtility.getInteger("Number 2: ");
        System.out.println("Sum: " + ArithmeticUtility.sum(i1, i2));
        System.out.println("Diff: " + ArithmeticUtility.diff(i1, i2));
        System.out.println("Multiply: " + ArithmeticUtility.multiply(i1, i2));
        double divisionResult = ArithmeticUtility.divide(i1, i2);
        if (divisionResult != -1) {
            System.out.println("Division: " + divisionResult);
        } else {
            System.out.println("Không thể chia cho 0!");
        }
    }
}
