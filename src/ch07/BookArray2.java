package src.ch07;

public class BookArray2 {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        library[0] = new Book("태백산맥", "조정래");
        library[1] = new Book("데미안", "헤르만 헤세");
        library[2] = new Book("자바 프로그래밍 입문", "박은종");
        library[3] = new Book("토지", "박경리");
        library[4] = new Book("어린왕자", "생텍쥐페리");


        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }

        for (int i = 0; i < library.length; i++) {
            library[i].showInfo();
        }
    }
}
