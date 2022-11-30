package src.ch09;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("운전자가 운전 중");
    }

    @Override
    public void stop() {
        System.out.println("운전자 정지");
    }

    @Override
    public void wiper() {
        System.out.println("와이퍼 오토!");
    }
}
