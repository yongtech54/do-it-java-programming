package src.ch10.practice;

import java.io.IOException;

public class SortTest {
    public static void main(String[] args) throws IOException {
        System.out.println("정렬 방식을 선택하세요");
        System.out.println("[B] Bubble sort");
        System.out.println("[H] Heap sort");
        System.out.println("[Q] Quick sort");

        int choice = System.in.read();
        int[] testingArray = new int[] {3,10,2,5,1,0,9};
        Sort sample = null;

        if (choice == 'B' || choice == 'b') {
            sample = new BubbleSort();
        }
        else if (choice == 'H' || choice == 'h') {
            sample = new HeapSort();
        }
        else if (choice == 'Q' || choice == 'q') {
            sample = new QuickSort();
        }
        else {
            System.out.println("지원하지 않는 정렬입니다.");
        }

        sample.ascending(testingArray);
        sample.descending(testingArray);
        sample.description();
    }
}
