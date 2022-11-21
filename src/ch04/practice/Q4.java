package src.ch04.practice;

public class Q4 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 3; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
