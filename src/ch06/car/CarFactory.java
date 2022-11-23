package src.ch06.car;

public class CarFactory {
    private static CarFactory instance = new CarFactory();
    private int serialNumber = 10001;

    private CarFactory() {}

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        serialNumber++;
        Car car = new Car(serialNumber);
        return car;
    }
}
