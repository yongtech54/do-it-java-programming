package src.ch10.call;

public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("등급이 높은 고객의 요청을 먼저 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("능숙한 직원에게 우선적으로 배분합니다.");
    }
}
