package src.ch03;

public class OperationEx5 {
    public static void main(String[] args) {
        int num = 0B00000000000000000000000000000101;   // 5

        System.out.println(num << 1);       // 10
        System.out.println(num << 2);       // 20
        System.out.println(num >> 1);       // 2
        System.out.println(num >> 2);       // 1
        System.out.println(num >> 3);       // 0

        int num2 = 10;
        num2 <<= 3;
        System.out.println(num2);           // 80

    }
}
