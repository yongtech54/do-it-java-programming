package src.ch13.innerclass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    private class InClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
            System.out.println("외부 클래스의 인스턴스 변수 > " + num);
            System.out.println("외부 클래스의 정적 변수 > " + sNum);
            System.out.println("내부 클래스의 인스턴스 변수 > " + inNum);
            System.out.println("내부 클래스 정적 변수는 허용되지 않습니다.");
        }
    }

    public void usingClass() {
        inClass.inTest();
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingClass();
    }
}
