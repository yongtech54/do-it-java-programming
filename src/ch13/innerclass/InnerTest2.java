package src.ch13.innerclass;

class OutClass2 {
    private int num = 10;
    private static int sNum = 20;

    static class InStaticClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
            System.out.println("외부 클래스 인스턴스 변수는 허용되지 않습니다.");
            System.out.println("외부 클래스 정적 변수 > " + sNum);
            System.out.println("내부 클래스 인스턴스 변수 > " + inNum);
            System.out.println("내부 클래스 정적 변수 > " + sInNum);
        }

        static void sTest() {
            System.out.println("외부 클래스 / 내부 클래스의 인스턴스 변수는 허용되지 않습니다.");
            System.out.println("외부 클래스 정적 변수 > " + sNum);
            System.out.println("내부 클래스 정적 변수 > " + sInNum);
        }
    }

}

public class InnerTest2 {
    public static void main(String[] args) {
        OutClass2.InStaticClass inStaticClass = new OutClass2.InStaticClass();
        inStaticClass.inTest();
        System.out.println("=========================================");
        OutClass2.InStaticClass.sTest();
    }
}
