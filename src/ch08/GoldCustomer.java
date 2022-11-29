package src.ch08;

public class GoldCustomer extends Customer{
    double discountRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "Gold";
        bonusRatio = 0.02;
        discountRatio = 0.1;
    }

    @Override
    public int calPrice(int price) {
        bonusPoint += bonusRatio * price;
        return price - (int)(price * discountRatio);
    }
}
