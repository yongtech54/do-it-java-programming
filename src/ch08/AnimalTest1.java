package src.ch08;

import java.util.ArrayList;

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunt() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 납니다.");
    }

    public void fly() {
        System.out.println("독수리가 비상합니다.");
    }
}

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

public class AnimalTest1 {

    public void moveAnimal(Animal animal) {
        animal.move();
    }

    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(new Human());
        animalList.add(new Tiger());
        animalList.add(new Eagle());

        for (Animal animal : animalList) {
            animal.move();
        }

        for (int i = 0; i < animalList.size(); i++) {
            Animal ani = animalList.get(i);
            if (ani instanceof Human) {
                ((Human) ani).readBook();
            }
            else if (ani instanceof Tiger) {
                ((Tiger) ani).hunt();
            }
            else if (ani instanceof Eagle) {
                ((Eagle) ani).fly();
            }
            else {
                System.out.println("잘못된 타입입니다.");
            }
        }
    }
}
