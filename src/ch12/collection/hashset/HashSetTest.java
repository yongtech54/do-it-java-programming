package src.ch12.collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(new String("제이슨"));
        hashSet.add(new String("다니엘"));
        hashSet.add(new String("데이빗"));
        hashSet.add(new String("조나단"));
        hashSet.add(new String("다니엘"));

        System.out.println(hashSet);
    }
}
