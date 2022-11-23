package src.ch06;

class BirthDay {
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }

    public BirthDay getThis() {
        return this;
    }
}

public class ThisEx1 {
    public static void main(String[] args) {
        BirthDay my = new BirthDay();
        System.out.println(my.getThis());
        my.setYear(1994);
        System.out.println(my.getThis());
        System.out.println(my);
    }
}
