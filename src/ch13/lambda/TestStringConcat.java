package src.ch13.lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        // case. 인터페이스 구현한 클래스로 메서드 호출
        String s1 = "Hello";
        String s2 = "Java";
        StringConcatImpl sample1 = new StringConcatImpl();
        sample1.makeString(s1, s2);

        // case. 람다식으로 인터페이스 구현
        StringConcat sample2 = (s, v) -> System.out.println(s + ", " + v);
        sample2.makeString(s1, s2);
    }
}
