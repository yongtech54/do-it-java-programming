package src.ch04.practice;

public class Q1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        char op = '+';
        int result = 0;

        if (op == '+') {
            result = num1 + num2;
        }
        else if (op == '-') {
            result = num1 - num2;
        }
        else if (op == '*') {
            result = num1 * num2;
        }
        else if (op == '/') {
            result = num1 / num2;
        }
        else {
            System.out.println("잘못된 식입니다.");
        }

        System.out.println("연산 결과 > " + result);
    }
}
