package src.ch15.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("src\\ch15\\reader\\reader.txt")) {
            int i = 0;

            while((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("완료!");

    }
}
