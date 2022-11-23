package src.ch06.cooperation;

public class Bus {
    int busNumber;
    int passenger;
    int money;

    Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void takeMoney(int money) {
        this.money += money;
        passenger++;
    }

    public void showInfo() {
        String result = String.format("버스 %s번의 승객 수는 %d명이고 오늘 수익은 %d원입니다.", busNumber, passenger, money);
        System.out.println(result);
    }
}
