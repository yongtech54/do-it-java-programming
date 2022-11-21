package src.ch04;

public class OneMin1 {
    public static void main(String[] args) {
        for (int i = 3; i < 8; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                System.out.println("\t" + i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
