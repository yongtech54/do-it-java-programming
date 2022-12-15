package src.ch12.collection.arraylist;

import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> myQueue;

    public MyQueue() {
        myQueue = new ArrayList<>();
    }

    public void enqueue(String data) {
        myQueue.add(data);
    }

    public String dequeue() {
        int length = myQueue.size();

        if(length == 0) {
            System.out.println("큐가 비어있습니다.");
            return null;
        }
        return myQueue.remove(0);
    }

    public void showAll() {
        for (String data : myQueue) {
            System.out.println(data);
        }
        System.out.println();
    }
}

public class QueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        queue.showAll();

        queue.dequeue();
        queue.showAll();
        queue.dequeue();
        queue.showAll();
        queue.dequeue();
        queue.showAll();
        queue.dequeue();
        queue.showAll();
    }
}
