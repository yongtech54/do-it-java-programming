package src.ch10.shelf;

public interface Queue {
    void enqueue(String title);
    String dequeue();
    int getSize();
}
