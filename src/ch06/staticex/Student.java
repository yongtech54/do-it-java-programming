package src.ch06.staticex;

public class Student {
    static int serialNumber = 1000;
    int studentID;
    String studentName;
    int grade;
    String address;

    Student() {
        this.studentID = serialNumber;
        serialNumber++;
    }
}
