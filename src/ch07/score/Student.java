package src.ch07.score;

import java.util.ArrayList;

public class Student {
    private String name;
    private int studentID;
    private ArrayList<Subject> subjectList;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        subjectList = new ArrayList<Subject>();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setSubjectName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for (int i = 0; i < subjectList.size(); i++) {
            System.out.println(name + "학생의 " + subjectList.get(i).getSubjectName() + " 과목 성적은 "
                                + subjectList.get(i).getScore() + "점 입니다.");
            total += subjectList.get(i).getScore();
        }

        System.out.println(name + "학생의 총점은 " + total + "점 입니다.");
    }
}
