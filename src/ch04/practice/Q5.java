package src.ch04.practice;

public class Q5 {
    public static void main(String[] args) {
        int i, j;

        int lines = 7;
        int stars = 1;
        int spaces = lines / 2 + 1;
        int midLine = lines / 2;

        for (i = 0; i < lines; i++) {
            for (j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (i < midLine) {
                stars += 2;
                spaces -= 1;
            }
            else {
                stars -= 2;
                spaces += 1;
            }

        }
    }
}
