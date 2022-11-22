package src.ch05;

public class Person {
    String name;
    int age;
    char gender;
    String address;
    float height;
    double weight;
    boolean isMarried;

    public Person() {}

    public Person(String pname) {
        name = pname;
    }

    public Person(String name, float height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
