package src.ch06.staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        System.out.println(Student.serialNumber);

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.studentID);
        System.out.println(s2.studentID);
        System.out.println(Student.serialNumber);
    }
}
