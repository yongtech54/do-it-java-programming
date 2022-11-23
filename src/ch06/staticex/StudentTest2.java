package src.ch06.staticex;

public class StudentTest2 {
    public static void main(String[] args) {
        Student2 james = new Student2();
        james.setStudentName("James");
        System.out.println(Student2.getSerialNumber());
        System.out.println(james.studentName + " 학번 : " + james.studentID);

        Student2 tomas = new Student2();
        tomas.setStudentName("Tomas");
        System.out.println(Student2.getSerialNumber());
        System.out.println(tomas.studentName + " 학번 : " + tomas.studentID);
    }
}
