package oop3;

import java.util.Scanner;

public class InputUtils {
    public static final Scanner sc = new Scanner(System.in);

    public static int getInteger(String message) {
        System.out.println(message);
        return sc.nextInt();
    }
}
