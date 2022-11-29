package src.ch08;

public class CustomerTest1 {
    public static void main(String[] args) {
        /*
        Customer customerLee = new Customer();
        customerLee.setCustomerID(10010);
        customerLee.setCustomerName("이순신");
         */

        int price = 10000;

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;  // protectd => 같은 패키지에서도 접근 가능
        System.out.println(customerLee.showCustomerInfo());

        /*
        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerID(10020);
        customerKim.setCustomerName("김유신");
         */

        Customer customerKim = new VIPCustomer(10020, "김유신", 100);
        customerKim.bonusPoint = 1000;
        System.out.println(customerKim.showCustomerInfo());
        System.out.println("==========할인율과 보너스 포인트 계산===========");

        int leePrice = customerLee.calPrice(price);
        int kimPrice = customerKim.calPrice(price);

        System.out.println(customerLee.getCustomerName() + "님이 " + leePrice + "원 지불하였습니다.");
        System.out.println(customerLee.showCustomerInfo());

        System.out.println(customerKim.getCustomerName() + "님이 " + kimPrice + "원 지불하였습니다.");
        System.out.println(customerKim.showCustomerInfo());
    }
}
