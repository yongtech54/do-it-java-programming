package src.ch07.practice.q4;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];

        dogs[0] = new Dog("날쎈돌이", "진돗개");
        dogs[1] = new Dog("순두부", "말티즈");
        dogs[2] = new Dog("뭉치", "포메라니안");
        dogs[3] = new Dog("피카츄", "시바견");
        dogs[4] = new Dog("쿠키", "닥스훈트");

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].showDogInfo());
        }

        System.out.println("=====================");

        for (Dog dog : dogs) {
            System.out.println(dog.showDogInfo());
        }
    }
}
