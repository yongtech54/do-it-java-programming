package src.ch06.staticex;

public class Student2 {
    private static int serialNumber = 1000;
    int studentID;
    String studentName;
    int grade;
    String address;

    Student2() {
        serialNumber++;
        this.studentID = serialNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public static int getSerialNumber() {
        return serialNumber;
    }

    public static void setSerialNumber(int serialNumber) {
        Student2.serialNumber = serialNumber;
    }
}
