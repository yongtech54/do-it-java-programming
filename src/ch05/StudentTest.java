package src.ch05;

public class StudentTest {

    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이순신";

        System.out.println(studentLee.studentName);
        System.out.println(studentLee.getStudentName());
    }
}
