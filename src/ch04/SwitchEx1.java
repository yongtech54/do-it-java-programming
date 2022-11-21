package src.ch04;

public class SwitchEx1 {
    public static void main(String[] args) {
        int rank = 1;
        char medal;

        switch(rank) {
            case 1:
                medal = 'G';
                break;
            case 2:
                medal = 'S';
                break;
            case 3:
                medal = 'B';
                break;
            default:
                medal = 'A';
        }

        System.out.println(rank + "등의 메달 색깔은 " + medal + "입니다!");
    }
}
