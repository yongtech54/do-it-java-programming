package src.ch10.calculator;

public interface Calc {
    // 상수 선언 (public static final 자동)
    double PI = 3.14;
    int ERROR = -9999999;

    // 추상 메서드 선언 (public abstract 자동)
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
    int square(int num);

    default void description() {
        System.out.println("interface에서 구현한 default method");
    }

    default void testMessage() {
        System.out.println("interface에서 구현한 testMessage()");
        myPrivate();
        staticPrivate();
    }

    public static void staticMessage() {
        System.out.println("interface의 static method");
        staticPrivate();

    }

    private void myPrivate() {
        System.out.println("private method");
    }

    private static void staticPrivate() {
        System.out.println("static private");
    }
}
