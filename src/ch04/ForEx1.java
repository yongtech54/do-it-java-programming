package src.ch04;

public class ForEx1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("1부터 10까지 합 > " + sum);
    }
}
