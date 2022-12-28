package src.ch15.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("src\\ch15\\outputstream\\output2.txt", true)) {
            byte[] bs = new byte[26];
            byte data = 65;

            for (int i = 0; i < bs.length; i++) {
                bs[i] = data++;
            }

            fos.write(bs);
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("출력 완료!");
    }
}
