package src.ch14;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println("예외처리합니다 > " + e);
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
