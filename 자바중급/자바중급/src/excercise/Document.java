package excercise;

public abstract class Document {
    abstract void open();
    abstract void close();
    void save(){
        System.out.println("저장합니다");
    }
    void revert(){
        System.out.println("revert합니다");
    }
}
