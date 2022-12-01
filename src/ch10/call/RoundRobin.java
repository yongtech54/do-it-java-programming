package src.ch10.call;

public class RoundRobin implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("다음 전화를 순서대로 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("순서대로 배분합니다.");
    }
}
