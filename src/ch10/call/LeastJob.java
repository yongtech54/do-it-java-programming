package src.ch10.call;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("다음 전화를 순서대로 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("가장 빨리 처리될 곳에 보냅니다.");
    }
}
