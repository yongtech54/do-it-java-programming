package src.ch13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s));
        System.out.println();

        Stream<String> stream2 = sList.stream();
        stream2.sorted().forEach(s -> System.out.println(s));
    }
}
