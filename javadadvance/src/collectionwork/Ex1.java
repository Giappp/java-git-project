package collectionwork;

import java.util.Collections;
import java.util.List;

/*
    Tạo danh sách List<String> tên người, sắp xếp và in ra theo alphabet.
 */

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Create some Conflict");
        List<String> list = new java.util.ArrayList<>(List.of("Nguyen Van A", "Tran Van B", "Nguyen Van C", "Hoang Van E"));
        Collections.sort(list);
        System.out.println("Create some Conflict");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
