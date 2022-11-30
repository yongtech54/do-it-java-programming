package src.ch09;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("===========자율 주행============");
        Car myCar = new AICar();
        myCar.run();

        System.out.println("===========직접 운전============");
        Car hisCar = new ManualCar();
        hisCar.run();
    }
}
