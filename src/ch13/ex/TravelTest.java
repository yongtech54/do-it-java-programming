package src.ch13.ex;

import java.util.ArrayList;


public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

        ArrayList<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("============[고객 명단]=============");
        customerList.stream().map(c -> c.getCustomerName()).forEach(s -> System.out.println(s));

        int totalPrice = customerList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("총 여행 비용: " + totalPrice + "만원");

        System.out.println("===========[20세 이상 고객 명단]============");
        customerList.stream()
                            .filter(customer -> customer.getAge() >= 20)
                            .map(customer -> customer.getCustomerName())
                            .sorted()
                            .forEach(s -> System.out.println(s));
    }
}
