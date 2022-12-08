package src.ch11;

public class StringTest1 {
    public static void main(String[] args) {
        // 생성자로 String instance 생성하여 비교
        String str1 = new String("java");
        String str2 = new String("java");

        System.out.println("str1과 str2 주소 동일 ? " + (str1 == str2));
        System.out.println("str1과 str2 값 동일 ? " + (str1.equals(str2)));
        System.out.println("str1의 hashCode: " + str1.hashCode());
        System.out.println("str2의 hashCode: " + str2.hashCode());

        // string literal로 비교
        String str3 = "java";
        String str4 = "java";

        System.out.println("str3과 str4 주소 동일 ? " + (str3 == str4));
        System.out.println("str3과 str4 값 동일 ? " + (str3.equals(str4)));
        System.out.println("str3의 hashCode: " + str3.hashCode());
        System.out.println("str4의 hashCode: " + str4.hashCode());
    }
}
