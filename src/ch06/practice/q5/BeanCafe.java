package src.ch06.practice.q5;

public class BeanCafe {
    private int money;
    
    public String getOrder(int price) {
        if (price == Coffee.BEANAMERICANO) {
            money += price;
            return "콩다방에서 아메리카노를 주문하였습니다.";
        }
        else if (price == Coffee.BEANLATTE) {
            money += price;
            return "콩다방에서 라떼를 주문하였습니다.";
        }
        return null;
    }
}
