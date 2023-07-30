package excercise;

public abstract class Application {
    abstract Document createDocument(Document document);

    void openDocument(){
        System.out.println("문서를 엽니다");
    }

}