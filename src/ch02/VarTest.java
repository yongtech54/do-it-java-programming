package src.ch02;

public class VarTest {
    public static void main(String[] args) {
        var i = 10;
        var j = 10.0;
        var str = "Java";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        i = 123;
        System.out.println(i);

        str = "Spring";
//        str = 123;    // 동일 타입으로는 변경이 되지만 다른 타입의 값을 받지는 못함
        System.out.println(str);
    }
}
