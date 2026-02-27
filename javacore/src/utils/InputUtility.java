package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Class hỗ trợ việc nhập và validate input từ commandline
 */

public class InputUtility {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int getInteger(String message) {
        while (true) {
            try {
                System.out.printf("%s", message);
                String input = br.readLine();
                return Integer.parseInt(input);
            } catch (IOException e) {
                System.out.println("Lỗi input, hãy nhập lại");
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Vui lòng nhập số!");
            }
        }
    }

    public static float getFloat(String message) {
        while (true) {
            try {
                System.out.printf("%s", message);
                String input = br.readLine();
                return Float.parseFloat(input);
            } catch (IOException e) {
                System.out.println("Lỗi input, hãy nhập lại");
            } catch (Exception exception) {
                System.out.println("Vui lòng nhập số!");
            }
        }
    }

    public static String getString(String message) {
        while (true) {
            try {
                System.out.printf("%s", message);
                return br.readLine();
            } catch (IOException e) {
                System.out.println("Lỗi input, hãy nhập lại");
            }
        }
    }
}
