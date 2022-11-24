package src.ch07.practice.q3;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
         int[] arr = new int[5];
         int cnt = 0;
         int sum = 0;

         for (int i = 1; i < 11; i++) {
             if (i % 2 == 0) {
                 arr[cnt] = i;
                 cnt++;
             }
         }

         for (int num : arr) {
             sum += num;
         }
        System.out.println(Arrays.toString(arr));
        System.out.println("총합 > " + sum);
    }
}
