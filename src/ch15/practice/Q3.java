package src.ch15.practice;

import java.io.*;

public class Q3 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("src\\ch15\\practice\\a.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos)) {
            osw.write("지금까지 자바 정말 재밌게 공부했어요");
        }catch (IOException e) {
            System.out.println(e);
        }

        try(FileInputStream fis = new FileInputStream("src\\ch15\\practice\\a.txt");
            InputStreamReader isr = new InputStreamReader(fis)) {
            int i = 0;

            while ( (i = isr.read()) != -1) {
                System.out.print((char)i);
            }
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
