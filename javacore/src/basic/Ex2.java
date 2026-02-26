package basic;

import java.util.Scanner;
/*
Viết chương trình tính chu vi và diện tích hình tròn.
*/
public class Ex2 {
    public static final double PI = 3.14;

    public static final Scanner sc = new Scanner(System.in);

    public static int getInteger(String message){
        System.out.printf("%s",message);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int r = getInteger("R = ");
        System.out.println("Diameter: " + 2 * PI * r);
        System.out.println("Area: " + PI * r * r);
    }
}
