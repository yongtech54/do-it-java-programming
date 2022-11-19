package src.ch02;

public class Variable3 {

    public static void main(String[] args) {
        /*
        * 정수 리터럴은 내부적으로 int형으로 처리가 되며 short, byte에 대한 별다른 처리는 제공하지 않음
        * 따라서 내부적으로는 int끼리의 연산으로 처리됨
        * */
        short sVal = 10;
        byte bVal = 20;

        System.out.println(sVal + bVal);
    }
}
