package src.ch05.test;

import src.ch05.hiding.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
//        stu1.name = "James";  <- 접근 제어자 private으로 인해 접근 불가능
        stu1.setName("James");
        System.out.println(stu1.getName());
    }
}
