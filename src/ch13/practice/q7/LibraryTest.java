package src.ch13.practice.q7;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("자바", 25000));
        bookList.add(new Book("파이썬", 15000));
        bookList.add(new Book("cpp", 30000));

        System.out.println("1. 모든 책 가격의 합");
        int totalPrice = bookList.stream().mapToInt(book -> book.getPrice()).sum();
        System.out.println(totalPrice);
        System.out.println("2. 20,000원 이상 책 이름 정렬");
        bookList.stream().filter(book -> book.getPrice() >= 20000).map(book -> book.getTitle()).sorted().forEach(book -> System.out.println(book));
    }
}
