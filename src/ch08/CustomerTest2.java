package src.ch08;

public class CustomerTest2 {
    public static void main(String[] args) {
        Customer vc = new VIPCustomer(10030, "나몰라", 2000);
        vc.bonusPoint = 1000;
        // virtual method에 의해 재정의된 인스턴스 메서드 호출
        System.out.println(vc.getCustomerName() + "님이 지불할 금액은 " + vc.calPrice(10000) + "원 입니다");
    }
}
