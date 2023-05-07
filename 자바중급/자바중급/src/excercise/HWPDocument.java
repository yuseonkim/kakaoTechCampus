package excercise;

public class HWPDocument extends Document{
    @Override
    void open() {
        System.out.println("HWP를 엽니다");
    }

    @Override
    void close() {
        System.out.println("HWP를 닫습니다");
    }
}
