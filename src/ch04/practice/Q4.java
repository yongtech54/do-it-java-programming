package src.ch04.practice;

public class Q4 {
    public static void main(String[] args) {
        int lines = 4;
        int stars = 1;
        int spaces = lines / 2 + 1;

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println();
            stars += 2;
            spaces -= 1;
        }
    }
}
