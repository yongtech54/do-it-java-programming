package src.ch12.generic;

public class Plastic extends Material{
    public void doPrinting() {
        System.out.println("[Plastic]로 출력");
    }

    @Override
    public String toString() {
        return "재료는 Plastic입니다";
    }
}
