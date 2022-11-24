package src.ch07;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = new int[] {10, 20, 30, 40, 50};
        int[] arr2 = new int[] {1, 2, 3, 4, 5};

        // for문 복사
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }

        // System.arraycopy() 메서드 활용
        System.arraycopy(arr1, 0, arr2, 1, 4);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
