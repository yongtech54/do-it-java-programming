package src.ch11;

public class WrapperTest {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(System.identityHashCode(a));
        a += 10;
        System.out.println(System.identityHashCode(a));

        Integer b = 10;
        System.out.println(System.identityHashCode(b));
        b += 10;
        System.out.println(System.identityHashCode(b));
        a += b;
        System.out.println(a);
        System.out.println(System.identityHashCode(a));

        System.out.println(b.intValue());
    }
}
