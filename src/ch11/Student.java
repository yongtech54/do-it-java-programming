package src.ch11;

public class Student {
    String name;
    int studentID;

    Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return studentID + ", " + name;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Student) {
            Student studentTemp = (Student) object;
            if (studentTemp.studentID == this.studentID) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentID;
    }
}
