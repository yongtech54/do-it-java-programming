package src.ch02;

public class TypeTest {
    public static void main(String[] args) {
        // int
        long longNum = 1001020012330L;  // 정수 리터럴은 내부적으로 4byte이므로 이를 오버하는 경우 식별자 입력
        long longNum2 = 100;            // 내부적으로 4byte를 넘지 않는 경우 식별자 생략 가능
        int intNum = 10;
        short shortNum = 15;
        byte byteNum = 1;

        /*
        * 리터럴 상수는 4byte를 기본 단위로 사용하므로 내부적으로 모두 int형으로 처리
        * */
        short num1 = 10;
        byte num2 = 20;

        System.out.println("덧셈 결과 >> " + (num1 + num2));

        char ch1 = 'A';
        char ch2 = 65;
        int ch3 = 'B';
        int ch4 = 66;
        
        // 내부적으로는 모두 0,1로 처리되므로 변수 선언 자료형에 따라 출력결과를 달리함
        // 이를 변환하고 싶은 경우 casting 사용
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);

        // Java는 UTF-16을 기반으로 인코딩/디코딩 처리
        char sample = '\uD55C';
        System.out.println(sample);

        // 실수형은 부동소수점 방식을 취함 (가수부분, 지수부분에 대하여 bit처리)
        double doubleNum = 3.141592;
        float floatNum = 3.14F;         // 실수 리터럴은 내부적으로 8byte이므로 float으로 처리하는 경우 식별자 표시

        // boolean
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(!b1);

        // var 선언 (java 10부터)
        var myVar = 102;        // complier는 해당 변수를 int로 인식
        System.out.println(myVar);
    }
}
