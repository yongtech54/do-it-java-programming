package src.ch06.cooperation;

public class Taxi {
    int money;
    String driverName;

    Taxi(String driverName) {
        this.driverName = driverName;
    }

    public void takeMoney(int money) {
        this.money += money;
    }

    public void showInfo() {
        String result = String.format("[%s] 기사님의 택시의 오늘 수입은 %d원입니다.", driverName, money);
        System.out.println(result);
    }
}
