package src.ch04.practice;

public class Q5 {
    public static void main(String[] args) {
        int i, j, k;


        for (i = 0; i < 7; i++) {
            if (i < 7 / 2 + 1) {
                for (j = i; j < 3; j++) {
                    System.out.print(" ");
                }
                for (k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                for (j = 7 / 2; j < i; j++) {
                    System.out.print(" ");
                }
                for (k = 0; k < 2 * (6 - i) + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
