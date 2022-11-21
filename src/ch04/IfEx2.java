package src.ch04;

public class IfEx2 {
    public static void main(String[] args) {
        int age = 11;
        int charge = 0;

        if (age < 8) {
            charge = 1000;
            System.out.println("아동입니다.");
        }
        else if (age < 14) {
            charge = 2000;
            System.out.println("초등학생입니다.");
        }
        else if (age < 20) {
            charge = 2500;
            System.out.println("중고등학생입니다.");
        }
        else {
            System.out.println("일반인입니다.");
        }

        System.out.println("요금 >> " + charge);
    }
}
