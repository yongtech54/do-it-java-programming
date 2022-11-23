package src.ch06.cooperation;

public class Student {
    String name;
    int grade;
    int money;

    Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.takeMoney(1500);
        money -= 1500;
    }

    public void takeSubway(Subway subway) {
        subway.takeMoney(2000);
        money -= 2000;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.takeMoney(10000);
        money -= 10000;
    }
    public void showInfo() {
        String result = String.format(name + "학생의 남은 돈은 " + money + "원 입니다.");
        System.out.println(result);
    }
}
