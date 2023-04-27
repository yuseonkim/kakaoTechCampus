package Chapter2.ch14;

public class test {
    public  static void main(String[] args) {
        Student student1 = new Student("james", 5000);
        Student student2 = new Student("tomas", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);
        Subway green = new Subway(2);

        student1.takeBus(bus100);
        student2.takeBus(bus100);
        student1.takeSubway(green);

        student1.showInfo();
        student2.showInfo();

        bus100.showBusInfo();
        green.showSubwayInfo();
    }
}
