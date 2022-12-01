package src.ch10.practice;

public interface Sort {
    void ascending(int[] inputArray);
    void descending(int[] inputArray);

    default void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다!");
    }
}
