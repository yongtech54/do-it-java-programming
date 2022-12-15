package src.ch12.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("데이빗");
        treeSet.add("게이트");
        treeSet.add("라파엘");

        System.out.println(treeSet);
    }
}
