package src.ch09;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("자율 주행 중");
    }

    @Override
    public void stop() {
        System.out.println("자율 정지");
    }
    
    @Override
    public void wiper() {
        System.out.println("자동 와이퍼");
    }
}
