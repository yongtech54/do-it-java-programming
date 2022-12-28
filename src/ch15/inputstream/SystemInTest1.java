package src.ch15.inputstream;

import java.io.IOException;

public class SystemInTest1 {
    public static void main(String[] args) {

        System.out.println("알파벳 하나를 쓰고 [ENTER]를 누르세요");
        try {
            int i = System.in.read();
            System.out.println("아스키코드 > " + i);
            System.out.println("변환 > " + (char)i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
