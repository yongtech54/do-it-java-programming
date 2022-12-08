package src.ch11.self;

class MyDate {
    int day;
    int month;
    int year;

    MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyDate) {
            MyDate temp = (MyDate) obj;
            if ((temp.day == day) && (temp.month == month) && (temp.year == year) ) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return day * 10 + month * 11 + year * 12;
    }
}

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(12, 8, 2022);
        MyDate date2 = new MyDate(12, 8, 2022);

        System.out.println("date1과 date2의 논리적 동일 판단 > " + (date1.equals(date2)));

        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
        System.out.println(System.identityHashCode(date1));
        System.out.println(System.identityHashCode(date2));
    }
}
