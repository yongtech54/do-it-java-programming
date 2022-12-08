package src.ch11.self;

class Student {
    String name;
    int studentID;

    Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return name + ", " + studentID;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student("Lee", 1001);
        System.out.println(studentLee);
    }
}
