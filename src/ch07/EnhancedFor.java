package src.ch07;

public class EnhancedFor {
    public static void main(String[] args) {
        String[] strArray = new String[] {"Java", "Android", "Kotlin", "Spring", "JavaScript"};

        for (String lang : strArray) {
            System.out.println(lang);
        }
    }
}
