package src.ch15.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
    public static void main(String[] args) {
        int i = 0;

        try (FileInputStream fis = new FileInputStream("src\\ch15\\inputstream\\input.txt")){
            while ((i = fis.read()) != -1) {
                System.out.println((char)i);
            }
        } catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
