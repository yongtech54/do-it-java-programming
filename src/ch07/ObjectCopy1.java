package src.ch07;

import java.util.Arrays;

public class ObjectCopy1 {
    public static void main(String[] args) {
        Book[] library1 = new Book[3];
        Book[] library2 = new Book[3];
        library1[0] = new Book("태백산맥", "조정래");
        library1[1] = new Book("데미안", "헤르만 헤세");
        library1[2] = new Book("자바 프로그래밍 입문", "박은종");

        System.arraycopy(library1, 0, library2, 0, library1.length);

        for (int i = 0; i < library2.length; i++) {
            library2[i].showInfo();
        }
    }
}
