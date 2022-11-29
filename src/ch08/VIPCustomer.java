package src.ch08;

public class VIPCustomer extends Customer{
    private int agentID;
    private double discountRatio;

    /*
    public VIPCustomer() {
        // super();
        customerGrade = "VIP";
        bonusRatio = 0.05;
        discountRatio = 0.1;
    }
    */

    public VIPCustomer(int cusomterID, String customerName, int agentID) {
        super(cusomterID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        discountRatio = 0.1;
        this.agentID = agentID;
    }

    public int getAgentID() {
        return agentID;
    }

    @Override
    public int calPrice(int price) {
        bonusPoint += (price * bonusRatio);
        return price - (int)(price * discountRatio);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 담당 상담원 아이디는 " + agentID + "입니다.";
    }
}
