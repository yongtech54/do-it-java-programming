package src.ch04;

public class Myself1 {
    public static void main(String[] args) {
        int score = 89;
        char grade;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        }
        else if (score >= 80) {
            grade = 'B';
        }
        else if (score >= 70) {
            grade = 'C';
        }
        else if (score >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        System.out.println(score + "점은 " + grade + "학점입니다.");
    }
}
