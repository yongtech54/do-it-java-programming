package src.ch13.innerclass;

class Outer {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(final int i) {
        final int num = 100;

        class MyRunnable implements Runnable {
            int localNum = 10;

            @Override
            public void run() {
                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);
                System.out.println("outNum = " + outNum);
                System.out.println("Outer.sNum = " + sNum);
            }
        }
        return new MyRunnable();
    }
}


public class LocalInnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(10);
        runnable.run();
    }
}
