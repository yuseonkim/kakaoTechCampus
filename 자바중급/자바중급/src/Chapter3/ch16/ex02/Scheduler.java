package Chapter3.ch16.ex02;

public interface Scheduler {
    void getNextCall();
    default void sendCalltoAgent(){
        System.out.println("상담원을 연결합니다.");
    }
}
