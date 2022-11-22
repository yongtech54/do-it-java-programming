package src.ch05;

public class Self1Test {
    public static void main(String[] args) {
        Self1 james = new Self1();
        james.age = 40;
        james.name = "James";
        james.isMarried = true;
        james.numberOfChildren = 3;

        james.showInfo();
    }
}
