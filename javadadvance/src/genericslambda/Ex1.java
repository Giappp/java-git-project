package genericslambda;

import java.util.Arrays;
import java.util.List;

/*
    Viết generic method in ra tất cả phần tử của 1 mảng.
    Dùng lambda để lọc ra các số chẵn trong List<Integer>.
 */

public class Ex1 {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{1, 2, 3, 4, 5};
        Float[] intFloat = new Float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        Double[] intDouble = new Double[]{1.3, 2.4, 3.6, 4.8, 5.5};

        display(intArr);
        display(intFloat);
        display(intDouble);

        List<Integer> evenList = Arrays.stream(intArr)
                .filter(intVal -> intVal % 2 == 0)
                .toList();

        for (var i : evenList) {
            System.out.println(i);
        }
    }

    /*
     Generic method
     Ở đây phải sử dụng Wrapper types do Generics trong Java chỉ hỗ trợ với kiểu object
    */
    public static <T> void display(T[] items) {
        for (T item : items) {
            System.out.print(" " + item);
        }
        System.out.println();
    }
}
