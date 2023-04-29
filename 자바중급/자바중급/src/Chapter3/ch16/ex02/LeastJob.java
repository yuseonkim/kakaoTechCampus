package Chapter3.ch16.ex02;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("대기가 가장 적은 상담원입니다");
    }
}
