package src.ch07;

public class ObjectCopy3 {
    public static void main(String[] args) {
        Book[] library1 = new Book[3];
        Book[] library2 = new Book[3];
        library1[0] = new Book("태백산맥", "조정래");
        library1[1] = new Book("데미안", "헤르만 헤세");
        library1[2] = new Book("자바 프로그래밍 입문", "박은종");

        for (int i = 0; i < library2.length; i++) {
            library2[i] = new Book();
            library2[i].setAuthor(library1[i].getAuthor());
            library2[i].setTitle(library1[i].getAuthor());
        }

        library1[0].setTitle("나목");
        library1[0].setAuthor("박완선");

        for (int i = 0; i < library1.length; i++) {
            library1[i].showInfo();
        }

        System.out.println("==============================");

        for (int i = 0; i < library2.length; i++) {
            library2[i].showInfo();
        }
    }
}
