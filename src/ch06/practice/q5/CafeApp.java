package src.ch06.practice.q5;

public class CafeApp {
    public static void main(String[] args) {
        Person customerKim = new Person("김씨", 10000);
        Person customerLee = new Person("이씨", 10000);

        StarCafe starCafe = new StarCafe();
        BeanCafe beanCafe = new BeanCafe();

        customerKim.buyStarCoffee(starCafe, 4000);
        customerLee.buyBeanCoffee(beanCafe, 4500);
    }
}
