package excercise;

public class HWPViewer extends Application{
    @Override
    Document createDocument(Document a) {
        return new HWPDocument();
    }
}
