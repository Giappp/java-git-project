package basic;

/*
Đề Bài: Viết chương trình nhập 2 số nguyên, in ra tổng, hiệu, tích, thương.
*/

import java.util.Scanner;

public class Ex1 {
    public static final Scanner sc = new Scanner(System.in);

    public static int getInteger(String message){
        System.out.printf("%s",message);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int i1 = getInteger("Number 1: ");
        int i2 = getInteger("Number 2: ");
        System.out.println("Sum: " + (i1 + i2));
        System.out.println("Diff: " + (i1 - i2));
        System.out.println("Multiply: " + (i1 * i2));
        System.out.println("Division: " + ((float) i1 / i2));
    }
}
