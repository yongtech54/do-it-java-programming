package src.ch05;

public class FunctionTest {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int minus(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int addAns = add(num1, num2);
        int minusAns = minus(num1, num2);
        int mulAns = multiply(num1, num2);
        int divAns = divide(num1, num2);

        System.out.println("덧셈 결과 > " + addAns);
        System.out.println("뺄셈 결과 > " + minusAns);
        System.out.println("곱셈 결과 > " + mulAns);
        System.out.println("나눗셈 결과 > " + divAns);
    }
}
