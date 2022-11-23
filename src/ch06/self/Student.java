package src.ch06.self;

public class Student {
    private static int serialNumber = 1000;
    int cardNumber;
    int studentID;

    Student() {
        serialNumber++;
        studentID = serialNumber;
        cardNumber = studentID + 100;
    }
}
