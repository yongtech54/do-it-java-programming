package src.ch05;

public class Self3 {
    public static void main(String[] args) {
        Person tomas = new Person("Tomas", 182.1F, 85.3);

        System.out.println(tomas.name + "의 키는 " + tomas.height + "cm 이고 몸무게는 "
        + tomas.weight + "kg이다.");
    }
}
