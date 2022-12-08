package src.ch11;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder br = new StringBuilder("java");
        System.out.println(System.identityHashCode(br));

        br.append(" spring");
        System.out.println(System.identityHashCode(br));
        br.append(" kotlin");
        System.out.println(System.identityHashCode(br));

        String res = br.toString();
        System.out.println(res);
        System.out.println(System.identityHashCode(res));
    }
}
