package src.ch13.innerclass;

class Outer2 {
    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable interface 익명 클래스로 구현");
        }
    };

    Runnable getRunnable(int i) {
        int num = 100;

        return new Runnable() {
            @Override
            public void run() {
                System.out.println("i > " + i);
                System.out.println("num > " + num);
            }
        };
    }
}

public class AnonymousInnerTest {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        Runnable runner1 = outer2.getRunnable(10);
        runner1.run();
        outer2.runner.run();
    }
}
