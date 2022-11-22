package src.ch05;

public class Self1 {
    int age;
    String name;
    boolean isMarried;
    int numberOfChildren;

    public void showInfo() {
        String result = null;
        if (isMarried) {
            result = String.format("이름은 %s이고 나이는 %d살, 결혼을 했고 자식은 %d명 있습니다.", name, age, numberOfChildren);
        } else {
            result = String.format("이름은 %s이고 나이는 %d살, 결혼은 안했고 자식은 %d명 있습니다.", name, age, numberOfChildren);
        }

        System.out.println(result);
    }
}
