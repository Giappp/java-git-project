package basic;

import utils.InputUtility;

/*
Viết chương trình tính chu vi và diện tích hình tròn.
*/
public class Ex2 {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        float r = InputUtility.getFloat("R = ");
        System.out.println("Diameter: " + 2 * PI * r);
        System.out.println("Area: " + PI * r * r);
    }
}
