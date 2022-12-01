package src.ch10.practice;

public class HeapSort implements Sort{
    @Override
    public void ascending(int[] inputArray) {
        System.out.println("HeapSort ascending");
    }

    @Override
    public void descending(int[] inputArray) {
        System.out.println("HeapSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("HeapSort입니다");
    }
}
