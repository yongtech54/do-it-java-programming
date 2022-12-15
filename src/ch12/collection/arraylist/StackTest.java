package src.ch12.collection.arraylist;

import java.util.ArrayList;

class MyStack {
    private ArrayList<String> myStack;

    public MyStack() {
        myStack = new ArrayList<>();
    }

    public void push(String data) {
        myStack.add(data);
    }

    public String pop() {
        int length = myStack.size();

        if (length == 0) {
            System.out.println("스택이 비어있습니다.");
            return null;
        }

        return myStack.remove(length - 1);
    }

    public void showAll() {
        for (String data : myStack) {
            System.out.println(data);
        }
    }
}

public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.pop();
        stack.push("D");

        stack.showAll();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.showAll();
    }
}
