package src.ch04.practice;

public class Q2 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i + "단은 건너뛰기!");
                continue;
            }

            System.out.println(i + "단 출력합니다.");

            for (int j = 1; j < 10; j++) {
                System.out.println("\t" + i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
