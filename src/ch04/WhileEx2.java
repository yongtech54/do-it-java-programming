package src.ch04;

public class WhileEx2 {
    public static void main(String[] args) {
        // do-while문 활용하여 1~10까지 합
        int i = 1;
        int sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= 10);

        System.out.println("1부터 10까지 합 >> " + sum);

    }
}
