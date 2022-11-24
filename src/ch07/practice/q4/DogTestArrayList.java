package src.ch07.practice.q4;

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        dogs.add(new Dog("1호", "갈색 시바"));
        dogs.add(new Dog("2호", "검은 시바"));
        dogs.add(new Dog("3호", "시바"));
        dogs.add(new Dog("4호", "검은 시바"));
        dogs.add(new Dog("5호", "갈색 시바"));

        for (Dog dog : dogs) {
            System.out.println(dog.showDogInfo());
        }
    }
}
