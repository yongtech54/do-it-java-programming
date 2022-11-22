package src.ch05;

public class StudentTest1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.studentName = "예지";
        student2.studentName = "채령";

        System.out.println(student1.getStudentName());
        System.out.println(student2.getStudentName());
    }
}
