package src.ch15.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\ch15\\decorator\\reader.txt"))) {
            int i = 0;

            while ( (i = isr.read()) != -1) {
                System.out.println((char) i);
            }
        }catch(IOException e) {
            System.out.println(e);
        }
    }
}
