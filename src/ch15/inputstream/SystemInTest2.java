package src.ch15.inputstream;

import java.io.IOException;

public class SystemInTest2 {
    public static void main(String[] args) {

        System.out.println("알파벳 여러개를 쓰고 [ENTER]를 누르세요");
        int i = 0;

        try {
            while((i = System.in.read()) != '\n') {
                System.out.println("아스키코드 > " + i);
                System.out.println("변환 > " + (char)i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
