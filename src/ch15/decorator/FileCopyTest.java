package src.ch15.decorator;

import java.io.*;

public class FileCopyTest {
    public static void main(String[] args) {
        /* 소요시간: 70.585 s
        long time = 0;
        try(FileInputStream fis = new FileInputStream("src\\ch15\\decorator\\a.zip");
            FileOutputStream fos = new FileOutputStream("src\\ch15\\decorator\\copy.zip")) {
                int i = 0;
                time = System.currentTimeMillis();
                while ( (i = fis.read()) != -1) {
                    fos.write(i);
                }
                time = System.currentTimeMillis() - time;
        } catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("작업1 소요시간 > " + time * 0.001);

         */


        // 소요시간: 0.324 s
        long time = 0;
        try(FileInputStream fis = new FileInputStream("src\\ch15\\decorator\\a.zip");
            FileOutputStream fos = new FileOutputStream("src\\ch15\\decorator\\copy.zip");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            int i = 0;

            time = System.currentTimeMillis();

            while ( (i = bis.read()) != -1) {
                bos.write(i);
            }
            time = System.currentTimeMillis() - time;

        } catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("작업2 소요시간 > " +  time * 0.001);
    }
}
