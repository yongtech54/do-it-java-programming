package src.ch05;

import java.util.Date;

class Order {
    String orderNumber;
    String customerID;
    String orderDate;
    String customerName;
    String productNumber;
    String address;

    public void showInfo() {
        String result = String.format("[주문번호] %s\n[주문자 아이디] %s\n[주문 날짜] %s\n" +
                "[주문자 이름] %s\n[주문 상품 번호] %s\n[배송 주소] %s", orderNumber, customerID, orderDate ,customerName
        , productNumber, address);

        System.out.println(result);
    }
}

public class Self2 {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.orderNumber = "201803120001";
        order1.customerID = "abc123";
        order1.orderDate = "2018년 3월 12일";
        order1.customerName = "홍길순";
        order1.productNumber = "PD0345-12";
        order1.address = "서울시 영등포구 여의도동 20번지";

        order1.showInfo();
    }
}
