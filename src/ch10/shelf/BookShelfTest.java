package src.ch10.shelf;

import java.util.Arrays;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookShelf = new BookShelf();
        bookShelf.enqueue("태백산맥1");
        bookShelf.enqueue("태백산맥2");
        bookShelf.enqueue("태백산맥3");
        System.out.println(bookShelf.getSize());

        System.out.println(bookShelf.dequeue());
        System.out.println(bookShelf.dequeue());
        System.out.println(bookShelf.dequeue());
        System.out.println(bookShelf.getSize());
    }
}
