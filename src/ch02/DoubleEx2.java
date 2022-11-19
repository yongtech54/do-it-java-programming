package src.ch02;

public class DoubleEx2 {
    public static void main(String[] args) {
        // 부동소수점 방식은 약간의 오차를 감수하고 더 넓은 범위의 실수를 표현
        double dNum = 1;

        for (int i = 0; i < 10000; i++) {
            dNum += 0.1;
        }

        System.out.println(dNum);
    }
}
