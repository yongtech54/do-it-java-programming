package src.ch10.practice;

public class QuickSort implements Sort{
    @Override
    public void ascending(int[] inputArray) {
        System.out.println("QuickSort ascending");
    }

    @Override
    public void descending(int[] inputArray) {
        System.out.println("QuickSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("Quicksort입니다");
    }
}
