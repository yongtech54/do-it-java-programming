package src.ch15.serialization;

import java.io.*;

class Person implements Serializable {
    String name;
    String job;

    public Person() {}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString() {
        return name + ", " + job;
    }
}

public class SerializationTest {
    public static void main(String[] args) throws ClassNotFoundException{
        Person personLee = new Person("이순신", "대표이사");
        Person personKim = new Person("김유신", "상무이사");

        try(FileOutputStream fos = new FileOutputStream("src\\ch15\\serialization\\serial.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(personLee);
            oos.writeObject(personKim);
        } catch(IOException e) {
            System.out.println(e);
        }

        try(FileInputStream fis = new FileInputStream("src\\ch15\\serialization\\serial.out");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj;
            while (( obj = ois.readObject()) != null) {
                if (obj instanceof Person) {
                    Person p = (Person) obj;
                }
                System.out.println(obj);
            }

        } catch(IOException e) {
            System.out.println(e);
        }

    }
}
