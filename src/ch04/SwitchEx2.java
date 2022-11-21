package src.ch04;

public class SwitchEx2 {
    public static void main(String[] args) {
        String medalColor = "Silver medal";

        switch (medalColor) {
            case "Golden medal":
                System.out.println("금메달입니다.");
                break;
            case "Silver medal":
                System.out.println("은메달입니다.");
                break;
            case "Bronze medal":
                System.out.println("동메달입니다.");
                break;
            default:
                System.out.println("메달이 없습니다.");
        }

    }
}
