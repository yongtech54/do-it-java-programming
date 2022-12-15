package src.ch12.generic;

public class Powder extends Material{
    public void doPrinting() {

        System.out.println("[Powder]로 출력");
    }

    @Override
    public String toString() {
        return "재료는 Powder입니다";
    }
}
