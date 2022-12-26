package src.ch13.practice.q5;

@FunctionalInterface
interface Calc {
    public int add(int num1, int num2);
}

public class CalcTest {
    public static void main(String[] args) {
        Calc myCalc = (n1, n2) -> n1 * n2;
        System.out.println(myCalc.add(1,5));
    }
}
