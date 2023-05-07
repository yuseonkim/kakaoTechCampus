package excercise;

public class HWPViewer extends Application{
    @Override
    Document createDocument() {
        return new HWPDocument();
    }
}
