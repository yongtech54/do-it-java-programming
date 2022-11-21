package src.ch04;

public class ContinueEx1 {
    public static void main(String[] args) {
        // 1부터 100까지 중 홀수 합
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            sum += i;
        }

        System.out.println("1부터 100까지 홀수 합 >> " + sum);
    }
}
