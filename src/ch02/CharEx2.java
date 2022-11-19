package src.ch02;

public class CharEx2 {
    public static void main(String[] args) {
        // Java는 UTF-16을 따라 char는 2byte로 데이터를 인코딩/디코딩
        // 직접 유니코드 값을 활용할 수도 있음
        char ch1 = '한';
        char ch2 = '\uD55C';

        System.out.println(ch1);
        System.out.println(ch2);
    }
}
