package src.ch03;

public class OperationEx1 {
    public static void main(String[] args) {
        int mathScore = 95;
        int engScore = 92;

        int totalScore = (mathScore + engScore);
        double avg = totalScore / 2.0;

        System.out.println("평균 : " + avg + "점");
    }
}
