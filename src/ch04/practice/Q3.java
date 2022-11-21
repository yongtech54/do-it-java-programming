package src.ch04.practice;

public class Q3 {
    public static void main(String[] args) {
        int dan;
        int times;

        for (dan = 2; dan < 10; dan++) {
            for (times = 1; times < 10; times++) {
                if (dan < times) {
                    break;
                }
                System.out.println(dan + " * " + times + " = " + (dan * times));
            }
            System.out.println();
        }
    }
}
