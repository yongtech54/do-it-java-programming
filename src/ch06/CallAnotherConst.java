package src.ch06;

class Person {
    String name;
    int age;

    Person() {
        this("이름 없음", 1);
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        String result = String.format("[이름] " + name + "\t[나이] " + age);
        System.out.println(result);
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person james = new Person("James", 24);
        Person tomas = new Person();

        james.showInfo();
        tomas.showInfo();
    }
}
