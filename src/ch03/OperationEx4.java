package src.ch03;

public class OperationEx4 {
    public static void main(String[] args) {
        // 3항 연산자 활용

        int myAge = 29;
        int yourAge = 28;

        String result = (myAge > yourAge) ? "연상" : "연하";
        System.out.println(result);
    }
}
