package Chapter3.ch10;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("운전자가 운전합니다");
    }

    @Override
    public void stop() {
        System.out.println("운전자가 멈춥니다");

    }
}
