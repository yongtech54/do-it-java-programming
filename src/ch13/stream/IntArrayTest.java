package src.ch13.stream;

import java.util.Arrays;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};

        int sumRes = Arrays.stream(arr).sum();
        int cnt = (int) Arrays.stream(arr).count();

        System.out.println(sumRes);
        System.out.println(cnt);
    }
}
