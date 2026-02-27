package collectionwork;

import java.util.HashMap;
import java.util.Map;
/*
    Dùng Map<String, Integer> đếm số lần xuất hiện của từ trong 1 đoạn văn bản.
 */

public class Ex2 {
    public static void main(String[] args) {
        String content =
                """
                        The quick brown fox jumps over the lazy dog.
                        This sentence contains every letter of the alphabet,
                        making it perfect for typing practice.
                        By typing this paragraph multiple times,
                        you can improve your speed and accuracy.
                        Focus on keeping a steady rhythm rather than just going as fast as you can.
                        Consistent practice will surely lead to better typing skills over time
                       """;
        Map<String, Integer> map = new HashMap<>();
        String[] tokens = content.split(" ");
        for (String token : tokens) {
            map.put(token, map.getOrDefault(token, 0) + 1);
        }

        System.out.println("Result");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
