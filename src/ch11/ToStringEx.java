package src.ch11;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + ", " + author;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book = new Book("자바문법책", "작가1");
        String str = new String("test");
        Integer intNum = 100;

        // Object.toString() => 인스턴스 정보를 문자열로 반환
        System.out.println(book);
        System.out.println(book.toString());

        // class에 따라 toString() override
        System.out.println(str);
        System.out.println(intNum);
    }
}
