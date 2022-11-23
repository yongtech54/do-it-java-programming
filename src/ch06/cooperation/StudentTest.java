package src.ch06.cooperation;

public class StudentTest {
    public static void main(String[] args) {
        Student james = new Student("James", 5000);
        Student tomas = new Student("Tomas", 10000);

        Bus bus1001 = new Bus(1001);
        Subway subway501 = new Subway(501);

        james.takeBus(bus1001);
        tomas.takeSubway(subway501);

        james.showInfo();
        tomas.showInfo();
        bus1001.showInfo();
        subway501.showInfo();

        Student edward = new Student("Edward", 25000);
        Taxi taxiKim = new Taxi("Kim");

        edward.takeTaxi(taxiKim);
        edward.showInfo();
        taxiKim.showInfo();
    }
}
