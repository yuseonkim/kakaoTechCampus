package Chapter3.ch16.ex01;

public class SuperLevel implements PlayerLevel{
    @Override
    public void run() {
        System.out.println("엄청 빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 점프합니다");
    }

    @Override
    public void turn() {
        System.out.println("턴 합니다.");


    }

    @Override
    public void showLevelMessage() {
        System.out.println("*********고급자 레벨입니다*********");
    }
}
