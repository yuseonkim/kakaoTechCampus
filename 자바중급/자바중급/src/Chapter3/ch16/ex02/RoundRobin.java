package Chapter3.ch16.ex02;

public class RoundRobin implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("한명씩 차례대로 연결합니다");
    }
}
