package src.ch11;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = new String("java");
        String str2 = new String("java");

        System.out.println("str1과 str2의 물리적 동일 판단 결과 > " + (str1 == str2));
        System.out.println("str1과 str2의 논리적 동일 판단 결과 > " + str1.equals(str2));

    }
}
