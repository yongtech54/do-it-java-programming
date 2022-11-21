package src.ch04;

public class BreakEx1 {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        for (i = 0; ; i++) {
            sum += i;
            if (sum >= 100) {
                break;
            }
        }
        System.out.println("sum > " + sum);
        System.out.println("num > " + i);
    }
}
