package src.ch15.stream.others;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 > ");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.print("직업을 입력하세요 > ");
        String job = scanner.nextLine();
        System.out.println(job);

        System.out.print("사번을 입력하세요 > ");
        int num = scanner.nextInt();
        System.out.println(num);

    }
}
