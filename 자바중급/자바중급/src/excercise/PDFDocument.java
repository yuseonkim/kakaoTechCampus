package excercise;

public class PDFDocument extends Document{
    @Override
    void open() {
        System.out.println("PDF를 엽니다");
    }

    @Override
    void close() {
        System.out.println("PDF를 닫습니다");
    }
}
