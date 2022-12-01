package src.ch10.call;

import java.io.IOException;

public class CallCenterApp {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택하세요.");
        System.out.println("[R] 한명씩 차례대로 할당");
        System.out.println("[L] 대기가 가장 적은 직원에게 할당");
        System.out.println("[P] 우선순위가 높은 고객 먼저 할당");
        System.out.println("[A] 상담원 재량");

        int choice = System.in.read();
        Scheduler scheduler = null;

        if (choice == 'R' || choice == 'r') {
            scheduler = new RoundRobin();
        }
        else if (choice == 'L' || choice == 'l') {
            scheduler = new LeastJob();
        }
        else if (choice == 'P' || choice == 'p') {
            scheduler = new PriorityAllocation();
        }
        else if (choice == 'A' || choice == 'a') {
            scheduler = new AgentGetCall();
        }
        else {
            System.out.println("알 수 없는 요청입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
