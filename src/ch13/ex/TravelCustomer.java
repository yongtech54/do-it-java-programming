package src.ch13.ex;

public class TravelCustomer {
    private String customerName;
    private int age;
    private int price;

    public TravelCustomer(String customerName, int age, int price) {
        this.customerName = customerName;
        this.age = age;
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name: " + customerName + " age: " + age + " price: " + price;
    }
}
