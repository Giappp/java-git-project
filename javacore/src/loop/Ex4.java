package loop;

/*
    In bảng cửu chương từ 2 đến 9 bằng vòng lặp for.
 */

public class Ex4 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.printf("Bảng cửu chương %d:\n", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%s * %s = %s\n", i, j, i * j);
            }
        }
    }
}
