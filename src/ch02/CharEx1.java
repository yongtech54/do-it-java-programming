package src.ch02;

public class CharEx1 {
    public static void main(String[] args) {
        // 내부적으로 0,1 처리가 되어 자료형에 따라 출력 결과가 달라짐
        // 이를 변환하고 싶은 경우 casting활용
        char ch1 = 'A';
        char ch2 = 66;
        int ch3 = 'C';
        int ch4 = 68;

        System.out.println(ch1);        // 'A'
        System.out.println(ch2);        // 'B'
        System.out.println(ch3);        // 67
        System.out.println(ch4);        // 68

        System.out.println((int) ch1);  // 65
        System.out.println((char) ch4); // 'D'
    }
}
