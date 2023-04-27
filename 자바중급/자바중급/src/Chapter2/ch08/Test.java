package Chapter2.ch08;

public class Test {
    public static void main(String[] args) {
        Person tomas = new Person("Tomas",37,"남성",180,78);
        tomas.printInfo();
        Order order1 = new Order("202011020003", 01023450001, "서울시 강남구 역삼동 111-333",
                "20201102", "130258", 35000, 0003);
        order1.printOrder();
    }


}
