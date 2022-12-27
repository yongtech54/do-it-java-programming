package src.ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("src\\ch14\\a.txt");
        } catch (FileNotFoundException e) {
            System.out.println("에러 1 > " + e);
            return;
        } finally {
            if (fis != null) {
                try {
                    fis.close();
//                    throw new IOException();
                } catch(IOException e) {
                    System.out.println("에러 2 > " + e);
                }
            }
            System.out.println("finally!");
        }
        System.out.println("프로그램 종료");
    }
}
