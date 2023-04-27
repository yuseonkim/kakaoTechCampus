package Chapter2.ch19;

public class CarFactory {
    static int serialNum = 10001;
    private static CarFactory instance = new CarFactory();
    private CarFactory(){}

    static CarFactory getInstance(){
        if(instance == null){
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar(){
        Car a = new Car();
        a.setCarNum(serialNum++);
        return a;
    }
}
