package src.ch06.practice.q6;

public class CardCompany {
    private static CardCompany instance = new CardCompany();
    private static int serialNumber = 1000;
    private CardCompany() {}

    public static CardCompany getInstance() {
        if (instance == null) {
            instance = new CardCompany();
        }
        return instance;
    }

    public Card createCard() {
        serialNumber++;
        Card card = new Card(serialNumber);
        return card;
    }
}
