package src.ch12.practice;

import java.util.HashMap;

class Car {
    String name;

    public Car() {}

    public Car(String name) {
        this.name = name;
    }

}

class CarFactory {
    private static CarFactory factory = new CarFactory();
    private HashMap<String, Car> hashMap = new HashMap<>();

    private CarFactory() {}

    public static CarFactory getInstance() {
        if (factory == null) {
            factory = new CarFactory();
            return factory;
        }
        return factory;
    }

    public Car createCar(String name) {
        if (hashMap.containsKey(name)) {
            return hashMap.get(name);
        }
        Car car = new Car(name);
        hashMap.put(name, car);
        return car;
    }
}

public class Q6 {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car sonata1 = factory.createCar("연수 차");
        Car sonata2 = factory.createCar("연수 차");
        System.out.println(sonata1 == sonata2); // true

        Car avante1 = factory.createCar("승연 차");
        Car avante2 = factory.createCar("승연 차");
        System.out.println(avante1 == avante2); // true

        System.out.println(sonata1 == avante1); // false
    }
}
