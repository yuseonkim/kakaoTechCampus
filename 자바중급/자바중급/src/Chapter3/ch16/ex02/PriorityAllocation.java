package Chapter3.ch16.ex02;

public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("우선순위가 높은 상담원입니다.");
    }
}
