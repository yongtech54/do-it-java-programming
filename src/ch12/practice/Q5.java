package src.ch12.practice;

import java.util.HashSet;

class Student implements Comparable<Student>{
    private String studentID;
    private String studentName;

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentID + ":" + studentName;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Student) {
            Student student = (Student) object;
            if (Integer.parseInt(this.studentID) == Integer.parseInt(student.studentID)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(studentID);
    }

    @Override
    public int compareTo(Student student) {
        return (Integer.parseInt(this.studentID) - Integer.parseInt(student.studentID));
    }
}

public class Q5 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();

        hashSet.add(new Student("100", "홍길동"));
        hashSet.add(new Student("200", "강감찬"));
        hashSet.add(new Student("300", "이순신"));
        hashSet.add(new Student("400", "정약용"));
        hashSet.add(new Student("100", "송중기"));

        System.out.println(hashSet);
    }
}
