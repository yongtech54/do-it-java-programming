package src.ch06.practice.q5;

public class Person {
    private String name;
    private int money;

    Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyStarCoffee(StarCafe cafe, int price) {
        String msg = cafe.getOrder(price);
        if (msg != null) {
            money -= price;
            System.out.println(msg);
            System.out.printf("[%s]의 남은 잔액은 [%d원]입니다.\n", name, money);
        }
    }

    public void buyBeanCoffee(BeanCafe cafe, int price) {
        String msg = cafe.getOrder(price);
        if (msg != null) {
            money -= price;
            System.out.println(msg);
            System.out.printf("[%s]의 남은 잔액은 [%d원]입니다.\n", name, money);
        }
    }
}
