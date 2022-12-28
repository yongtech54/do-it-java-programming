package src.ch15.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("src\\ch15\\writer\\writer.txt")) {
            fw.write('A');
            char[] buffer = {'B', 'C', 'D', 'E'};
            fw.write(buffer);
            fw.write("안녕하세요");
            fw.write("65");
        } catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("출력이 완료되었습니다");
    }
}
