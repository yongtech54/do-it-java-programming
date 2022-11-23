package src.ch06.cooperation;

public class Subway {
    int subwayNumber;
    int passenger;
    int money;
    
    Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
    }
    
    public void takeMoney(int money) {
        this.money += money;
        passenger++;
    }

    public void showInfo() {
        String result = String.format("지하철 %s호의 승객 수는 %d명이고 오늘 수익은 %d원입니다.", subwayNumber, passenger, money);
        System.out.println(result);
    }
}
