package src.ch07;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + "번째 요소: " + numbers[i]);
        }
    }
}
