package src.ch06.car;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car benz = factory.createCar();
        Car tesla = factory.createCar();

        System.out.println(benz.getCarNumber());
        System.out.println(tesla.getCarNumber());
    }
}
