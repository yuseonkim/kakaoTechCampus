package excercise;

public class PictureDocument extends Document{
    @Override
    void open() {
        System.out.println("Picture를 엽니다");
    }

    @Override
    void close() {
        System.out.println("Picture를 닫습니다");
    }
}
