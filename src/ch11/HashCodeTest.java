package src.ch11;

public class HashCodeTest {
    public static void main(String[] args) {
        String str1 = new String("java");
        String str2 = new String("java");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Integer num1 = new Integer(100);
        Integer num2 = new Integer(100);

        System.out.println(num1.hashCode());
        System.out.println(num2.hashCode());
    }
}
