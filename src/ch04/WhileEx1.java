package src.ch04;

public class WhileEx1 {
    public static void main(String[] args) {
        // while문 활용하여 1~10 합
        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum += i;
            i++;
        }

        System.out.println("1부터 10까지 합 >> " + sum);
    }
}
