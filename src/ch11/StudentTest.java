package src.ch11;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee1 = new Student("Lee", 1001);
        Student studentLee2 = studentLee1;
        Student studentLee3 = new Student("Lee", 1001);

        System.out.println(studentLee1);
        System.out.println(studentLee2);
        System.out.println(studentLee3);

        // 물리적 동일 확인
        if (studentLee1 == studentLee2) {
            System.out.println("학생1과 학생2의 주소는 같습니다.");
        }
        else {
            System.out.println("학생1과 학생2의 주소는 다릅니다.");
        }

        // 논리적 동일 확인
        if (studentLee1.equals(studentLee2)) {
            System.out.println("학생1과 학생2는 논리적으로 동일합니다.");
        }
        else {
            System.out.println("학생1과 학생2는 논리적으로 다릅니다.");
        }

        if (studentLee1 == studentLee3) {
            System.out.println("학생1과 학생3의 주소는 같습니다.");
        }
        else {
            System.out.println("학생1과 학생3의 주소는 다릅니다.");
        }

        if (studentLee1.equals(studentLee3)) {
            System.out.println("학생1과 학생3은 논리적으로 동일합니다.");
        }
        else {
            System.out.println("학생1과 학생3은 논리적으로 다릅니다.");
        }

        System.out.println(studentLee1.equals(studentLee2));
        System.out.println(studentLee1.equals(studentLee3));


        System.out.println(studentLee1.hashCode());
        System.out.println(studentLee2.hashCode());
        System.out.println(studentLee3.hashCode());

        System.out.println(System.identityHashCode(studentLee1));
        System.out.println(System.identityHashCode(studentLee2));
        System.out.println(System.identityHashCode(studentLee3));
    }
}
