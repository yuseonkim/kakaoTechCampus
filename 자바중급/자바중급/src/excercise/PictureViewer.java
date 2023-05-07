package excercise;

public class PictureViewer extends Application{
    @Override
    Document createDocument() {
        return new PictureDocument();
    }
}
