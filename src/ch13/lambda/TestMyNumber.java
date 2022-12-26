package src.ch13.lambda;

@FunctionalInterface
interface MyNumber {
    public abstract int getMax(int num1, int num2);
}

public class TestMyNumber {
    public static void main(String[] args) {
        MyNumber max = (x, y) -> (x > y) ? x : y;
        System.out.println(max.getMax(10, 20));
    }
}
