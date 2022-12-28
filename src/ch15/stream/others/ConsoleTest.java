package src.ch15.stream.others;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.print("이름 > ");
        String name = console.readLine();

        System.out.println("내 이름은 " + name + "입니다.");
    }
}
