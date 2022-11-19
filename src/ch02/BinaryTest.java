package src.ch02;

public class BinaryTest {
    public static void main(String[] args) {
        // int (4 byte) => 32 bit로 표현
        int num1 = 0B00000000000000000000000000000101;
        int num2 = 0b11111111111111111111111111111011;
        int sum = num1 + num2;

        System.out.println("num1 10진법 변환 >> " + num1);
        System.out.println("num2 10진법 변환 >> " + num2);
        System.out.println("binary number로 표현한 5와 -5의 덧셈 결과 >> " + sum);

        // 진법 표현
        System.out.println("=====정수 191에 대한 다양한 진법 변환 결과=====");
        for (int i = 2; i < 11; i++) {
            System.out.println(i + "진법 >> " + Integer.toString(191, i));
        }

        int x = 21;
        String binaryX = Integer.toBinaryString(x);
        System.out.printf("21을 2진법으로 변환한 결과 >> %s", binaryX);
    }
}
