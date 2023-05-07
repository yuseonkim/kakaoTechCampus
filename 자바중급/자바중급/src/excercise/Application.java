package excercise;

public abstract class Application {
    abstract Document createDocument();
    void newDocument(){
        Document doc = createDocument();
        doc.open();
    }

    void openDocument(){
        System.out.println("문서를 엽니다");
    }

}